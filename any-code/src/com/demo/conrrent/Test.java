package com.demo.conrrent;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("first info");
        Thread consumerThread = new Thread(() -> {
            Consumer consumer = new Consumer(queue);
            try {
                consumer.getByQueue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread providerThread = new Thread(() -> {
            Provider provider = new Provider(queue);
            try {
                provider.putToQueue("Hello World");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumerThread.start();
        providerThread.start();


    }
}
