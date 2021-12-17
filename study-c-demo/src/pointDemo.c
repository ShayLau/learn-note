//
// Created by Mr.x on 2021/7/31.
//
#include "../include/pointDemo.h"
#include "stdio.h"

void getPointAddressDemo() {
    int a = 0;
    int p = (int) &a;
//    printf("0x%p", p);
    printf("a内存地址：%p\n", &a);
    printf("p内存地址：%p\n", &p);

}


void pointPrintDemo(int *p) {
    printf("*p:%p\n", p);
    printf("p:%d", *p);
}


void intPointDispose() {
    int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int *p = a;
    printf("int p地址=%p\n", p);
    printf("int p数值=%d\n", *p);
    printf("++p地址(int)=%p\n", ++p);
    printf("++p数值(int)=%d\n", *p);
}

void charPointDispose() {
    char a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    char *p = a;
    printf("char p地址=%p\n", p);
    printf("char p数值=%d\n", *p);
    printf("++p地址(char)=%p\n", ++p);
    printf("++p数值(char)=%d\n", *p);
}

void pointWhileDemo() {
    char a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1};
    char *p = a;
    printf("*p:%p\n", p);
    printf("a[0]:%p\n", a);
    while (*p != -1) {
        printf("p:%d\n", *p);
        p++;
    }
}
