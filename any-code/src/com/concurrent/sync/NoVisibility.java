package com.concurrent.sync;

/**
 * 非可见的值
 *
 * 
 */
public class NoVisibility {

    public static boolean visibility;
    public static int number;


    public static class NoVisibilityThread extends Thread {
        @Override
        public void run() {
            while (!visibility) {
                Thread.yield();
            }
            System.out.println("number:" + number);
        }
    }


    public static void main(String[] args) {
        new NoVisibilityThread().start();
        number = 42;
        visibility = true;
    }
}
