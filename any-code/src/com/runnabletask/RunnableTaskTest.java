package com.runnabletask;

import java.util.concurrent.*;

public class RunnableTaskTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "hello world";
        });

        executorService.submit(futureTask);


    }

}
