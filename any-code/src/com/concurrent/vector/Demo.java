package com.concurrent.vector;

import java.util.*;

public class Demo {


    public void test() {
//
//        Vector vector=new Vector();
//
//        Set set=new HashSet();
//
//
//        Map  map=new HashMap();


        int hashCode1 = "13".hashCode();
        int hashCode2 = "12".hashCode();
        int hashCode3 = "Hello".hashCode();


        Date date = new Date();

        System.out.println(date.hashCode());

        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(hashCode3);



    }


    public static void main(String[] args) {
        Demo d = new Demo();
        d.test();
        System.out.println(d.hashCode());

    }
}
