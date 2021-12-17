package com.demo.conrrent;

import java.util.Queue;

/**
 * 提供者
 */
public class Provider {

    private Queue<String> queue;

    public Provider(Queue<String> queue) {
        this.queue = queue;
    }

    /**
     * 向队列放信息
     *
     * @param str
     */
    public void putToQueue(String str) throws InterruptedException {
        while (true) {
            synchronized (queue) {
                if (queue.size() <= 10000) {
                    queue.add(str);
                    System.out.println("Queue add:" + str + "，Queue size:" + queue.size());
                    System.out.println("通知消费线程");
                    queue.notifyAll();
                }
            }
        }

    }
}
