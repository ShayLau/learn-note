package com.concurrent.thread.waitandnotify;

public class WriteTest {

    public static void main(String[] args) {
        Note note = new Note();

        Thread readThread = new Thread(new Read(note));
        Thread write = new Thread(new Write(note));
        readThread.start();
        write.start();

    }
}