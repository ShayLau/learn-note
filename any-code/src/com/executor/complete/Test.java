package com.executor.complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //CompletableFuture<Double> futurePrice = getPriceAsync();
//        //do anything you want, 当前线程不被阻塞
//        System.out.println(111);
//        //线程任务完成的话，执行回调函数，不阻塞后续操作
//        futurePrice.whenComplete((aDouble, throwable) -> {
//            System.out.println(aDouble);
//            //do something else
//        });
//        System.out.println(222);

        System.out.println("111");
        CompletableFuture future = getPriceAsync2();
        future.whenComplete((result, throwable) -> {
            System.out.println("执行结果："+result);
            //do something else
        });
        System.out.println("222");
        System.out.println(future.join());
        /*
        执行结果如下：
        111
        当前执行线程：ForkJoinPool.commonPool-worker-9
        222
        执行结果：1.0
        1.0*/
    }

    static CompletableFuture<Double> getPriceAsync() {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        System.out.println("当前执行线程：" + Thread.currentThread().getName());
        new Thread(() -> {
            try {
                System.out.println("当前执行线程：" + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            futurePrice.complete(23.55);
        }).start();
        System.out.println("当前执行线程：" + Thread.currentThread().getName());
        return futurePrice;
    }

    static CompletableFuture<Double> getPriceAsync2() throws ExecutionException, InterruptedException {
        CompletableFuture<Double> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前执行线程：" + Thread.currentThread().getName());
            try {
                //通过睡眠时间来模拟执行程序时间
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1.00;
        });
        return completableFuture;
    }
}
