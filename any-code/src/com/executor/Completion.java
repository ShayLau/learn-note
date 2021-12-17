package com.executor;

import java.util.concurrent.*;

public class Completion {
    /**
     * 运行任务
     */
    public void runTask() {
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L, TimeUnit.SECONDS, blockingQueue);

        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(threadPoolExecutor);



        int taskCount = 0;
        for (int i = 0; i < 10; i++) {
            int num = i;
            Future<String> future = executorCompletionService.submit(() -> {
                Thread.sleep(1000 * num);
                return Thread.currentThread().getName() + ":Hello World";
            });
            taskCount++;
        }
        while (taskCount != 0) {
            try {
                Future<String> future = executorCompletionService.take();
                System.out.println("task:" + future.get());
                taskCount--;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
                System.out.println(e.getCause().getMessage());
            }
        }
        if (taskCount == 0) {
            threadPoolExecutor.shutdown();
            System.out.println("线程池关闭成功");
        }
    }
}
