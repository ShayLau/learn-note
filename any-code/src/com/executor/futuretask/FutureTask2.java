package com.executor.futuretask;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTask2 implements Callable<String> {

    private FutureTask<String> task;

    public FutureTask2(FutureTask<String> task) {
        this.task = task;
    }

    @Override
    public String call() throws Exception {
        System.out.println("准备茶叶");
        System.out.println(task.get());
        System.out.println("制作完成");
        return "";
    }
}
