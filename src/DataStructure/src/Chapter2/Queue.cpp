/**
 * Author: wxh
 * Date: 2023/1/19
 * Desc:
 *
 */


#include "Predefined.h"
#define MAXSIZE 100

typedef int ElemType;
typedef int Status;

class SqQueue {

public:
    typedef struct {
        ElemType *base;
        int front;
        int rear;
    } Queue;

    void InitQueue(Queue &Q) {
        Q.base = new ElemType[MAXSIZE];
        Q.front = Q.rear = 0;
    }

    int QueueLength(Queue Q) {
        return (Q.rear - Q.front + MAXSIZE) % MAXSIZE;
    }

    bool EnQueue(Queue &Q, ElemType e) {
        if ((Q.rear + 1) % MAXSIZE == Q.front) return false;
        Q.base[Q.rear] = e;
        Q.rear = (Q.rear + 1) % MAXSIZE;

        return true;
    }

    bool DeQueue(Queue &Q, ElemType &e) {
        if (Q.front == Q.rear) return false;
        e = Q.base[Q.front];
        Q.front = (Q.front + 1) % MAXSIZE;

        return true;
    }

    ElemType getHead(Queue Q) {
        if (Q.front != Q.rear) {
            return Q.base[Q.front];
        }

        return 0;
    }

};

class LinkedQueue {

    typedef struct QNode {
        ElemType data;
        QNode *next;
    } QNode, *QueuePtr;

    typedef struct {
        QueuePtr front;
        QueuePtr rear;
    } LinkQueue;

    void InitQueue(LinkQueue &Q) {
        Q.front = Q.rear = new QNode;
        Q.front->next = nullptr;
    }

    void DestroyQueue(LinkQueue &Q) {
        while (Q.front) {
            QNode *p = Q.front->next;
            delete Q.front;
            Q.front = p;
        }
    }

    void EnQueue(LinkQueue &Q, ElemType e) {
        QNode *node = new QNode;
        node->data = e;
        node->next = nullptr;
        Q.rear->next = node;
        Q.rear = node;
    }

    bool DeQueue(LinkQueue &Q, ElemType e) {
        if (Q.front == Q.rear) return false;
        QNode *p = Q.front->next;
        Q.front->next= p->next;
        e = p->data;
        if (Q.rear == p) Q.rear = Q.front;
        delete p;
        return true;
    }

    ElemType getHead(LinkQueue Q) {
        if (Q.front == Q.rear) return -1;
        ElemType e = Q.front->next->data;
        return e;
    }

};

