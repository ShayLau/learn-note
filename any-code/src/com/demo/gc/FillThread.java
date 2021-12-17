package com.demo.gc;


public class FillThread {


    public static void main(String []args)  {


            Thread thread=new Thread(new Runnable() {

                @Override
                public void run(){
                    try{
                        int count=1000;
                        while(count-- >0){
                            Thread.sleep(2999);
                            byte[] bytes=new byte[1024*1];

                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });
            thread.start();






    }
}
