package com.compare;

/**
 * 测试
 *
 */
public class Test {


    public static  void main(String []args){

        User user1=new User();

        user1.setName("user1");

        User user2=new User();
        user2.setName("user2");


        System.out.println(user1==user2);
        System.out.println("user1 内存地址："+user1);
        System.out.println("user1 hashCode："+user1.hashCode());
        System.out.println("user2 内存地址："+user2);
        System.out.println("user2 hashCode："+user2.hashCode());
        user1=user2;
        System.out.println("user1=user2:"+(user1==user2));
        System.out.println(user1);
        System.out.println(user2);



    }
}
