package com.runnable;

import java.util.concurrent.*;

/**
 * Future使用引用数据数据类型作为参数
 * 传递给ExecutorService.submit()方法时
 */
public class RunnableResult {

    public void test() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Integer result = new Integer(0);
        Future<Integer> future = executorService.submit(new RunnableTask(result), result);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {
        RunnableResult runnableResult = new RunnableResult();
        runnableResult.test();
    }

}
