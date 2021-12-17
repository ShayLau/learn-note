package com.demo.conrrent;

import java.util.Queue;

/**
 * 消费者
 */
public class Consumer {

    private Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    /**
     * 获取队列头信息
     */
    public void getByQueue() throws InterruptedException {
        while (true) {
            synchronized (queue) {
                if (queue.size() == 0) {
                    System.out.println("进入等待");
                    queue.wait();
                } else {
                    String str = queue.poll();
                    System.out.println("Queue poll:" + str + ",queue size:" + queue.size());
                }
            }
        }
    }
}
