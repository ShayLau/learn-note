package com.executor.complete;

import java.util.concurrent.*;

public class CompletionTest {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 2, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));

        CompletionService completionService = new ExecutorCompletionService(poolExecutor);


    }
}
