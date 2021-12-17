package com.executor.futuretask;

import java.util.concurrent.Callable;

public class FutureTask1 implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("清洗茶具");
        Thread.sleep(1000);
        return "热水准备好了";
    }
}
