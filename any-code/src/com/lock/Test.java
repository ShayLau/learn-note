package com.lock;

public class Test {
    public static void main(String[] args) {
        System.out.println(1<<16);
        System.out.println((1 << 16) - 1);
        System.out.println(((1 << 16) - 1)&1);
        System.out.println(((1 << 16) - 1)&2);
        System.out.println(((1 << 16) - 1)&2);
        System.out.println(((1 << 16) - 1)&3);
        System.out.println(((1 << 16) - 1)&4);
        System.out.println(((1 << 16) - 1)&5);
        System.out.println(((1 << 16) - 1)&6);
        System.out.println(((1 << 16) - 1)&7);
    }
}
