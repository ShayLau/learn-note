package com.executor.complete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorInvokeTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(20);


        List<Callable<String>> taskList = new ArrayList<>();

        taskList.add(() -> "hello world");
        taskList.add(() -> {
            Thread.sleep(5000);
            return "Hello world 2";
        });
        taskList.add(() -> "Hello world 3");

        try {
            List<Future<String>> futureList = executor.invokeAll(taskList, 2, TimeUnit.SECONDS);

            Iterator<Future<String>> iterator = futureList.iterator();
            while (iterator.hasNext()) {
                Future<String> future = iterator.next();
                System.out.println("task result:" + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (CancellationException e) {
            e.printStackTrace();

        } finally {
            executor.shutdown();
        }

    }
}
