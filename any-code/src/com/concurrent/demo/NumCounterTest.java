package com.concurrent.demo;

/**
 * 线程
 *
 * @author mrxu
 */
public class NumCounterTest {

    private long count = 0;

    private void add() {
        int indx = 0;
        while (indx++ < 10000) {
            count += 1;
        }
    }

    public static long threadRun() throws InterruptedException {
        final NumCounterTest test = new NumCounterTest();
        Thread thread = new Thread(() -> test.add());
        Thread thread2 = new Thread(() -> test.add());
        thread.start();
        thread2.start();

        thread.join();
        thread.join();
        return test.count;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(NumCounterTest.threadRun());
    }

}
