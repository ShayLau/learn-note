//
// Created by Mr.x on 2021/8/2.
//

#ifndef CODE_LINKEDLIST_H
#define CODE_LINKEDLIST_H
typedef struct Node {
    int value;
    struct linkedList *next;
} Node;

typedef struct List {
    Node *head;
    Node *tail;
} List;


List addNode(List list,int number);

List* nodeAddDemoTest() ;

#endif //CODE_LINKEDLIST_H
