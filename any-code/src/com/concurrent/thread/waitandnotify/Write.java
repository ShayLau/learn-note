package com.concurrent.thread.waitandnotify;

public class Write  implements  Runnable{

    Note note;

    public Write(Note note) {
        this.note = note;
    }

    @Override
    public void run() {

        synchronized (note){
            while(true){
                if(note.getInfo()!=null){
                    System.out.println(" Note 的最新信息："+note.getInfo());
                    note.notify();
                    break;
                }else{
                    System.out.println(" Write   Note  写入信息中");
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    note.setInfo("Hello World");
                }
            }
        }
    }
}
