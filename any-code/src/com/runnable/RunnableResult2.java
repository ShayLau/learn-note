package com.runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Future使用引用数据数据类型作为参数
 * 传递给ExecutorService.submit()方法时
 */
public class RunnableResult2 {

    public void test() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Object object = new Object();
        Future<Object> future = executorService.submit(new RunnableTask2(object), object);
        try {
            System.out.println(future.get().getUserName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {
        RunnableResult2 runnableResult = new RunnableResult2();
        runnableResult.test();
    }

}
