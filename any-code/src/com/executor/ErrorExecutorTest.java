package com.executor;

import java.util.concurrent.*;

public class ErrorExecutorTest {
    /**
     * 创建指定大小的线程池
     *
     * @return
     */
    public ThreadPoolExecutor createThreadPool() {
        BlockingQueue blockingQueue = new LinkedBlockingQueue(10);
        //使用规定大小的容量创建阻塞队列创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 0, TimeUnit.SECONDS, blockingQueue);
        return threadPoolExecutor;
    }

    /**
     * 给定的线程池执行线程任务
     *
     * @param threadPoolExecutor 线程池
     * @param runnable           线程任务
     */
    public void executeTask(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        threadPoolExecutor.execute(runnable);
    }

    /**
     * 给定的线程池执行线程任务
     *
     * @param threadPoolExecutor 线程池
     * @param runnable           线程任务
     */
    public Future submitRunnableTask(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        return threadPoolExecutor.submit(runnable);
    }

    public static void main(String[] args) {
        ErrorExecutorTest executorTest = new ErrorExecutorTest();
        ThreadPoolExecutor threadPoolExecutor = executorTest.createThreadPool();
        try {
            //execute执行线程任务
            executorTest.executeTask(threadPoolExecutor, () -> {
                int[] array = new int[]{1, 2, 3};
                System.out.println("array index -1:" + array[-1]);
            });

            //submit runnable线程任务
            Future submitRunnableFuture = executorTest.submitRunnableTask(threadPoolExecutor, () -> {
                int[] array = new int[]{1, 2, 3};
                System.out.println("array index -1:" + array[-1]);
            });
            Object result = submitRunnableFuture.get();
            System.out.println("Submit Callable Task get:" + result);

            Future submitRunnableFuture2 = executorTest.submitRunnableTask(threadPoolExecutor, () -> {
                int[] array = new int[]{1, 2, 3};
                System.out.println("array index 0:" + array[0]);
            });
            Object result2 = submitRunnableFuture2.get();
            System.out.println("Submit Callable Task get:" + result2);

        } catch (InterruptedException e) {
            System.out.println("中断错误执行的原因：" + e.getCause());

        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            //关闭线程池
            threadPoolExecutor.shutdown();
            System.out.println("线程池已关闭");
        }
    }
}
