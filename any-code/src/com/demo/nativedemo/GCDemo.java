package com.demo.nativedemo;

import sun.misc.GC;

public class GCDemo {

    public Object instance=null;


    public static void main(String []args){

        GCDemo g1=new GCDemo();
        GCDemo g2=new GCDemo();


        g1.instance=g2;
        g2.instance=g1;


        g1=null;
        g2=null;

        System.gc();

    }
}
