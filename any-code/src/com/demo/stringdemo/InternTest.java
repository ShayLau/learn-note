package com.demo.stringdemo;

public class InternTest {

    public static void main(String[] args) {


//        String str2 = new StringBuilder().append("ja").append("va").toString();
//        System.out.println(str2 + ",hash:" + str2.hashCode());
//        String internStr2 = str2.intern();
//        System.out.println(internStr2 + ",hash:" + internStr2.hashCode());
//        System.out.println(str2 == internStr2);
//
//        System.out.println("------------");
//
//        String str1 = new StringBuilder().append("计算机").append("软件").toString();
//        System.out.println(str1 + ",hash:" + str1.hashCode());
//        String internStr1 = str1.intern();
//        System.out.println(internStr1 + ",hash:" + internStr1.hashCode());
//        System.out.println(str1 == internStr1);
////
////        System.out.println("------------");
////
////        System.out.println("1".intern()==new String("1"));
////
////        System.out.println("------------");
////        System.out.println(new String("1")=="1".intern());
//
//        //jdk1.7中的intern方法实现不会再复制实例，只是在常量池中记录首次会出现的实例引用，
//        //因此intern返回的引用和StringBUilder创建的那个字符串实例是同一个
//        //
////        System.out.println("------------");
////
////        String s="1";
////        System.out.println(s.intern()==s);
//
//        System.out.println("------------");
//
//        String s1=new String("Test");
//        String s1Intern=s1.intern();
//        System.out.println(s1==s1Intern);
//
//        System.out.println("------------");
////
////        String s2=new StringBuilder("3").toString();
////        System.out.println(s2.intern()==s2);
//


        String str=new String("hello");
        System.out.println(str.intern()==str);

        String str2="World";
        System.out.println(str2.intern()==str2);


        String str3=new StringBuilder().append("Hello Wrold").toString();

        System.out.println(str3.intern()==str3);

    }
}
