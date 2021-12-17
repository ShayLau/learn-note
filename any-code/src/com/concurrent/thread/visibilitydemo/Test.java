package com.concurrent.thread.visibilitydemo;

public class Test {

    static class readThread extends  Thread{

        private static   boolean ready;
        private static  int num;

        @Override
        public void run() {

            while(!ready){
                try{
                    System.out.println(num);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        public static  void  main(String []a){

            readThread noVisibility=new readThread();

            noVisibility.start();

            num=10;
            ready=true;

        }
    }

}

