package com.executor;

import java.util.concurrent.*;

public class ExecutorPoolTest {

    /**
     * 创建多个线程池
     */
    public void createManyThreadPool() {
        //确定数量的线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        //可缓存的线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //单例线程池
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        //定时调度的线程池
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);

        fixedThreadPool.submit(() -> System.out.println("helloWorld"));
        cachedThreadPool.submit(() -> System.out.println("helloWorld"));
        singleThreadPool.submit(() -> System.out.println("helloWorld"));
        scheduledThreadPool.submit(() -> System.out.println("helloWorld"));

    }

    /**
     * 创建指定大小的线程池
     *
     * @return
     */
    public ThreadPoolExecutor createThreadPool() {
        //核心线程池大小
        int coreSize = 5;
        //最大线程数量
        int maxSize = 10;
        //保持时间
        long keepaliveTime = 0;
        //阻塞队列容量
        int capacity = 100;
        //阻塞队列
        BlockingQueue blockingQueue = new LinkedBlockingQueue(capacity);
        //使用规定大小的容量创建阻塞队列创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(coreSize, maxSize, keepaliveTime, TimeUnit.SECONDS, blockingQueue);

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

    /**
     * 给定的线程池执行线程任务
     *
     * @param threadPoolExecutor 线程池
     * @param callable           线程任务
     */
    public Future submitCallableTask(ThreadPoolExecutor threadPoolExecutor, Callable callable) {
        return threadPoolExecutor.submit(callable);
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorPoolTest executorPoolTest = new ExecutorPoolTest();

        ThreadPoolExecutor threadPoolExecutor = executorPoolTest.createThreadPool();
        //execute执行线程任务
        executorPoolTest.executeTask(threadPoolExecutor, () -> System.out.println("Execute Runnable Task"));

        //submit runnable线程任务
        Future submitRunnableFuture = executorPoolTest.submitRunnableTask(threadPoolExecutor, () -> System.out.println("Submit Runnable Task"));
        System.out.println("Submit Runnable Task get:" + submitRunnableFuture.get());

        //submit callable线程任务
        Future submitCallableFuture = executorPoolTest.submitCallableTask(threadPoolExecutor, () -> "Submit Callable Task");
        System.out.println("Submit Callable Task get:" + submitCallableFuture.get());

        //关闭线程池
        threadPoolExecutor.shutdown();

//        Execute Runnable Task
//        Submit Runnable Task
//        Submit Runnable Task get:null
//        Submit Callable Task get:Submit Callable Task
    }


}
