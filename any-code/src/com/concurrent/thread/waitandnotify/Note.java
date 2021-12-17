package com.concurrent.thread.waitandnotify;

public class Note {

    private String info;


    public Note(String info) {
        this.info = info;
    }

    public Note() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
