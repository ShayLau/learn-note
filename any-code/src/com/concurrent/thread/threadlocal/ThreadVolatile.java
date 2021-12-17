package com.concurrent.thread.threadlocal;

import java.util.ArrayList;
import java.util.List;

public class ThreadVolatile {


    private final List list;

    public ThreadVolatile(List list) {
        this.list = list;


    }

    public void read() {
        if (list != null) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }


}

class VolatileList implements Runnable {

    @Override
    public void run() {
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ThreadVolatile threadVolatile = new ThreadVolatile(list);

        threadVolatile.read();

    }
}


class Run {

    public static void main(String[] args) {

        Thread thread = new Thread(new VolatileList());
        thread.start();
    }
}
