package com.lock;

import java.util.concurrent.Callable;

public class ExecutorTask implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return "当前执行任务的线程:" + Thread.currentThread().getName();
    }
}
