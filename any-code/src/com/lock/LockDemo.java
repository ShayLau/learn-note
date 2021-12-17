package com.lock;

public class LockDemo{

    public Object lockObject=new Object();


    public void run(){
        synchronized(lockObject){
            System.out.println("run()");
            run2();
        }
    }

    public void run2(){
        synchronized(lockObject){
            System.out.println("run2()");
        }
    }

    public static void main(String[] args) {
        LockDemo demo=new LockDemo();
        demo.run();
    }

}