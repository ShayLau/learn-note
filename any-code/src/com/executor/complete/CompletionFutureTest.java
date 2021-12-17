package com.executor.complete;

import java.util.concurrent.CompletableFuture;

public class CompletionFutureTest {
    public static void main(String[] args) {

        System.out.println("执行一个异步任务");
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("执行任务");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        future1.join();
        System.out.println("异步任务已添加");
        future1.whenComplete((result, exception) -> {
            System.out.println("任务执行完毕");
        });

    }
}