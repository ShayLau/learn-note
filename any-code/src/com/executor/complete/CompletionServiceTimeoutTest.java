package com.executor.complete;

import java.util.concurrent.*;

public class CompletionServiceTimeoutTest {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
        CompletionService completionService = new ExecutorCompletionService(poolExecutor);

        Future future = completionService.submit(() -> {
            Thread.sleep(3000);
            return "Hello";
        });

        Future future2 = completionService.submit(() -> {
            Thread.sleep(3000);
            return "Hello";
        });
        try {
            future.get(1, TimeUnit.SECONDS);
            System.out.println(future2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            future.cancel(true);
            System.out.println("超时取消任务");
        } finally {
            poolExecutor.shutdown();
        }

    }
}
