package com.lock;

import java.util.concurrent.*;

/**
 * 执行器
 *
 * 
 */
public class ExecutorTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            ExecutorTask task = new ExecutorTask();
            Future<String> future = executorService.submit(task);
            try {

                String result = future.get();
                System.out.println(result);

            } catch (ExecutionException ex) {
                //打印错误信息的原始错误
                ex.getCause().printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        //executorService.shutdown();
    }


}
