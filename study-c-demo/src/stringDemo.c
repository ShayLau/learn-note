//
// Created by Mr.x on 2021/7/31.
//
#include "../include/stringDemo.h"
#include "string.h"
#include "stdio.h"

int stringLengthDemo(const char *array) {
    printf("array length%lu:", strlen(array));
    char word[] = "hello World！";
    printf("%s", word);
    char line[] = "Hello";
    printf("%lu\n", strlen(line));
    return 0;
}

void stringCmpDemo() {
    char str1[] = "abc";
    char str2[] = "abc";
    printf("%d\n", strcmp(str1, str2));
    if (strcmp(str1, str2) == 0) {
        printf("相等");
    }
}

void stringSizeOfDemo() {
    int num1[] = {1, 2,};
    printf("len:%lu", sizeof(num1) / sizeof(num1[0]));
}

void stringSwapDemo(char *char1, char *char2) {
    char temp = *char1;
    *char1 = *char2;
    *char2 = temp;
}