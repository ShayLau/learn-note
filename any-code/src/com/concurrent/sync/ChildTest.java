package com.concurrent.sync;

public class ChildTest extends Test {

    @Override
    public synchronized void print() {

        System.out.println("ChildTest: Hello");
        super.print();
    }
}
