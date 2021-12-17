package com.concurrent.thread.visibilitydemo;

public class Demo {

    volatile boolean isRun;

    public  void run(){
        while(!isRun){  //不是true一直执行
            System.out.println("Do Something!");
        }
    }
    public void stop(){
        isRun=true;
    }

}
class demoMain{

    public  static void main (String[]a)throws InterruptedException{
        Demo d=new Demo();
        Thread thread=new Thread(()->{
            d.run();
        });

        thread.start();
        Thread.sleep(1000);
        d.isRun=true;

    }

}