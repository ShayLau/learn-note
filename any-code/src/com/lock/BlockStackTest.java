package com.lock;

public class BlockStackTest {
    public static void main(String[] args) {
        BlockStack stack = new BlockStack(10);
        Thread thread = new Thread(() -> {
            while (true) {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                String content = "hello world";
                System.out.println("stack放入内容:"+content);
                stack.put(content);
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("获取stack内容：" + stack.get());
            }
        });

        thread.start();
        thread2.start();
    }
}
