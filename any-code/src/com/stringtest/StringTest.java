package com.stringtest;

public class StringTest {
    public static void main(String[]args){
        String ss = new String("123456");

        System.out.println("ss = " + ss);

        ss.replace('1', '0');   //栈中创建一个新的地址引用，堆中存放一个ss替换'1'的数据值

        System.out.println("ss = " + ss); //replace后，没有改变ss栈中的内存地址引用

        ss= ss.replace('1', '0');

        System.out.println("ss = " + ss); //replace后，ss栈中的内存地址引用发生改变

    }

    int num=0;

    public void count(){

        num++;

    }
}
