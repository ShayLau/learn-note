package com.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 线程池
 */
public class MyThreadPool {
    BlockingQueue<Runnable> workQueue = null;
    List<WorkerThread> threads = new ArrayList<>();

    public MyThreadPool(int poolSize, BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
        for (int i = 0; i < poolSize; i++) {
            WorkerThread thread = new WorkerThread();
            thread.start();
            threads.add(thread);
        }
    }


    void execute(Runnable command) {
        try {
            workQueue.put(command);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 工作线程
     */
    class WorkerThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable runnable = workQueue.take();
                    runnable.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>(2);
        MyThreadPool threadPool = new MyThreadPool(10, blockingQueue);

        threadPool.execute(() -> System.out.println("Hello world!"));

    }
}


