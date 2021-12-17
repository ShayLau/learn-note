package com.executor.complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int i = 1 / 0;
            return 100;
        });
        future.join();
        future.get();
    }
}
