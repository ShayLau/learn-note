package com.concurrent.thread.waitandnotify;

/**
 * 
 */
public class ThreadA  implements  Runnable{

    @Override
    public void run() {

        synchronized (this){
            System.out.println("Thread-Name:"+Thread.currentThread().getName());

            notify();
        }
    }
}
