package com.concurrent.sync;

public class SynchronizedTest {
    public static void main(String[] args) {
//        ChildTest test = new ChildTest();
//        test.print();

        SynchronizedTest synchronizedTest = new SynchronizedTest();
        synchronizedTest.test1();
    }


    public synchronized void test1() {
        System.out.println("test1");
        System.out.println(this);
        test2();
    }

    public synchronized void test2() {
        System.out.println("test2");
        System.out.println(this);
    }
}
