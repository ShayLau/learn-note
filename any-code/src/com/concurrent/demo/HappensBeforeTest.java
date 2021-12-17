package com.concurrent.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Happens Before 原则测试
 *
 * 
 */
public class HappensBeforeTest {

    public void test() throws Exception {
        AtomicInteger num = new AtomicInteger();
        Thread t1 = new Thread(() -> num.set(3));

        Thread t2 = new Thread(() -> {
            if (num.get() == 3) {
                num.set(4);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(num);
    }

    public static void main(String[] args) throws Exception {
        HappensBeforeTest happensBeforeTest = new HappensBeforeTest();

        happensBeforeTest.test();
    }
}
