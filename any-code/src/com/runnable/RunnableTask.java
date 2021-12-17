package com.runnable;

public class RunnableTask implements Runnable {

    Integer result;

    public RunnableTask(Integer result) {
        this.result = result;
    }


    @Override
    public void run() {
        result = 100;
    }
}
