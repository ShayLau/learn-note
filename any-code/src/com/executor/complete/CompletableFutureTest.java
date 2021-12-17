package com.executor.complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task1");
            return "task1";
        });
        CompletableFuture task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task2");
            return "test2";
        });
        CompletableFuture task3 = task1.thenCombine(task2,(t1,t2)-> t1.toString()+"-"+t2.toString());
        task3.join();
        System.out.println(task3.get());
    }
}
