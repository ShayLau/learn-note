//
// Created by Mr.x on 2021/8/2.
//
#include "LinkedList.h"
#include "stdio.h"
#include "stdlib.h"

List addNode(List list, int number) {
//    Node *p = malloc(sizeof(Node));
//    p->value = number;
//    p->next = NULL;
//    if (list.head == NULL) {
//        //链表的头是新元素
//        list.head = p;
//        list.head->next = list.tail;
//        list.tail = NULL;
//    } else {
//        list.tail->next = p;
//    }
//    return list;
}

List *nodeAddDemoTest() {
    List *pList = malloc(sizeof(List));
    pList->head = pList->tail = NULL;
    int number;
    do {
        printf("输入链表元素,-1表示结束：\n");
        scanf("%d", &number);
        if (number != -1) {
            addNode(*pList, number);
        }
    } while (number != -1);
    return pList;
}


/**
 * 链表初始化最初的方法
 * 最初的方法
 * @return
 */
Node init() {
    Node *head = NULL;
    int number;
    do {
        printf("输入链表元素,-1表示结束：\n");
        scanf("%d", &number);
        if (number != -1) {
            Node *p = malloc(sizeof(Node));
            p->value = number;
            p->next = NULL;
            Node *last = head;
            // 0=false=NULL
            if (last) {
                while (last->next) {
                    last = last->next;
                }
                last->next = p;
            } else {
                head = p;
            }
        }
    } while (number != -1);

}