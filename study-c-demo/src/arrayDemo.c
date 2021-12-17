//
// Created by Mr.x on 2021/7/31.
//
#include "../include/arrayDemo.h"
#include "stdio.h"

void arrayDemoPrint() {
    char wordArray1[] = {'h', 'e', 'l', 'l', 'o', '\0'};
    char wordArray2[] = {'h', 'e', 'l', 'l', 'o', '1'};
    char wordArray3[] = {"hello\0"};
    char wordArray4[] = {"hello0"};
    printf("wordArray1：%s\n", wordArray1);
    printf("wordArray2：%s\n", wordArray2);
    printf("wordArray3：%s\n", wordArray3);
    printf("wordArray4：%s\n", wordArray4);
//    放在内存的程序代码段，存放的字符串的内存地址, str 是一个字符串常量指针地址，内容不能修改
    char *str = "Hello";
//    word 可以进行修改，使用的是字符数组存储
    char wordArray5[] = "Hello";
//    内存中占用字符的数量大小
    char line[10] = "hello";
}

void arrayLengthDemo(int array[]) {
    //printf("int  length:%d\n", sizeof(array) / sizeof(array[0]));
}


void charArrayMonthDemo() {
    char *a[] = {"JANUARY", "february", "march", "april", "may", "june", "july",
                 "august", "september", "october", "november", "december"};
    int month;
    printf("请输入月份:\n");
    scanf("%d", &month);
    int i = 0;
    int len = sizeof(a) / sizeof(a[0]);
    while (i != len) {
        if (i == month - 1) {
            printf("月份:%s", a[i]);
            break;
        }
        i++;
    }
}


void arrayTest() {
    int array[10];
    array[1] = 1;
    printf("arrays:%d\n", array[1]);
    printf("Array:%d\n", array[1]++);
}