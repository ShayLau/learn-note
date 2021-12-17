package com.executor.complete;

import java.util.concurrent.*;

public class CompletionServiceTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 10, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        CompletionService completionService = new ExecutorCompletionService(executor);

        completionService.submit(() -> "Hello world1");
        completionService.submit(() -> "Hello world2");
        completionService.submit(() -> "Hello world3");
        completionService.submit(() -> "Hello world4");


        Future future = completionService.take();

        System.out.println(future.get());


    }
}
