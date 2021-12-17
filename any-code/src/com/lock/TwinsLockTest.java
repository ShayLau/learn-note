package com.lock;

import java.util.concurrent.locks.Lock;

public class TwinsLockTest {

    public static void main(String[] args) {
        final Lock lock = new TwinsLock();


        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                while (true) {
                    lock.lock();
                    try {
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            });
            thread.start();
        }
    }
}
