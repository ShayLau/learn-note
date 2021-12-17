package com.runnable;

public class RunnableTask2 implements Runnable {

    Object object;

    public RunnableTask2(Object object) {
        this.object = object;
    }
    @Override
    public void run() {
        object.setUserName("Hello");
    }
}