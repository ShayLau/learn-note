#include <stdio.h>
#include <math.h>
#include "../include/baseDemo.h"

void demoPrint(){
    printf("%d\n",1+1);
    printf("%d\n",1%1);
    printf("%f\n",1.0);
    printf("%s\n","1.0");
}
void demoCalculate(){
    int a,b=0;
    scanf("%d %d",&a,&b);
    printf("%d + %d = %d\n",a,b,a+b);
    printf("%d - %d = %d\n",a,b,a-b);
    printf("%d * %d = %d\n",a,b,a*b);
    printf("%d / %d = %d\n",a,b,a/b);
}


void demoChange() {
    double price, change = 0;
    scanf("%lf", &price);
    change = 100.00 - price;
    printf("数字%lf\n", change);

    int val = 0;
    printf("val++: %d\n ", val++);
    printf("val: %d\n ", val);
    int val2 = 0;
    printf("val2: %d\n ", ++val2);
}

void demoFloatTest() {
    float x = 0.0;
    float result = 0;
    scanf("%1f", &x);
    if (x == 0) {
        result = 0;
    } else if (x != 0) {
        result = 1 / x;
    }
    printf("f(%.1f) = %.1f\n", x, result);
}

void demoPowFunction() {
    int num = 0;
    scanf("%d", &num);
    for (int i = 0; i <= num; i++) {
        double result = pow(num, i);
        printf("pow(%d,%d) = %f\n", num, i, result);
    }
}

void demoPowFunction2(){
    int num=0;
    scanf("%d",&num);
    for(int i=0;i<=num;i++){
        if(i==0){
            printf("pow(%d,%d) = %d\n",num,i,1);
        }else{
            printf("pow(%d,%d) = %d\n",num,i,num*i);
        }
    }
}

void demoTypeLength() {
    int a=0;
    a = sizeof(int);
    long b = sizeof(long int);
    printf("int sizeof:%d\n", a);
    printf("long int sizeof:%ld\n", b);
}


void gotoDemo() {
    goto label;
    printf("Hello World");
    label:
    printf("Hello");
}

void whileDemo() {
    int num = 121;
    int size = 0;
    while ((num /= 10) > 0) {
        size++;
        printf("size:%d\n", size);
    }
}
