package com.executor.futuretask;

import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) {

        FutureTask<String> futureTask = new FutureTask(new FutureTask1());
        FutureTask<String> futureTask2 = new FutureTask(new FutureTask2(futureTask));
        Thread thread1 = new Thread(futureTask);
        Thread thread2 = new Thread(futureTask2);
        thread1.start();
        thread2.start();
        // 执行结果：
        // 清洗茶具
        // 准备茶叶
        // 热水准备好了
        // 制作完成

    }
}
