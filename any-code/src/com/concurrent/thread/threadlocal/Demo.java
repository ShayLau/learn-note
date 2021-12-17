package com.concurrent.thread.threadlocal;

public class Demo implements Runnable {

    private ThreadLocal<Object> info = new ThreadLocal<>();


    @Override
    public void run() {

        info.set("Thread Name:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);

            System.out.println(info.get());
        } catch (InterruptedException e) {

        }
    }
}

class DemoMain{
    public static void main(String[]args){

        for(int i=0;i<1000;i++){
            new Thread(new Demo()).start();
        }
    }
}
