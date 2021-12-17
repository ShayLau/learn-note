package com.concurrent.thread.waitandnotify.lock;

import com.concurrent.thread.waitandnotify.Note;

import java.util.concurrent.locks.Lock;

public class Read implements Runnable {

    Note note;

    public Read(Note note) {
        this.note = note;
    }

    @Override
    public void run() {

        Lock lock;


        if (note.getInfo() == "" || note.getInfo() == null) {
            try {
                System.out.println("Read Note 无信息");
                note.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Read  Note 信息：" + note.getInfo());
    }
}
