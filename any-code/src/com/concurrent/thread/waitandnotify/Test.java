package com.concurrent.thread.waitandnotify;

public class Test {

    public  static  void  main(String[]args){


        Thread t=new Thread(new ThreadA());
        t.start();
        try{
            synchronized (t){
                t.wait();
                System.out.println("Thread-Name:"+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
