package com.concurrent.demo;

public class NullPointTest {

    private static NumCounterTest numCounterTest = null;

    static {
        if (numCounterTest == null) {
            synchronized (NullPointTest.class) {
                if (numCounterTest == null) {
                    numCounterTest = new NumCounterTest();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(NullPointTest.numCounterTest);
    }
}
