/**
 * Author: wxh
 * Date: 2023/1/18
 * Desc:
 *
 * 栈的实现:
 * 实现了顺序栈和链式栈
 *
 */


#include "Predefined.h"

#define MAXSIZE 100

typedef int ElemType;
typedef int Status;

using namespace std;

//顺序栈的实现
class SqStack {

public:

    typedef struct {
        ElemType *base; //栈底指针
        ElemType *top; //栈顶指针
        int stackSize; //栈的大小,预定义成MAXSIZE
    } Stack;

    //初始化顺序栈:栈顶指针和栈底指针相同
    Status InitStack(Stack &S) {
        S.base = new ElemType[MAXSIZE];
        if (!S.base) exit(OVERFLOW);
        S.top = S.base;
        S.stackSize = MAXSIZE;

        return OK;
    }

    //销毁栈
    Status DestroyStack(Stack &S) {
        if (S.base) {
            delete S.base;
            S.stackSize = 0;
            S.top = S.base = nullptr;
        }

        return OK;
    }

    //清除栈
    Status ClearStack(Stack &S) {
        if (S.base) {
            S.top = S.base;
        }

        return OK;
    }

    //判断栈是否为空
    Status isEmpty(Stack S) {
        if (S.top == S.base) return TRUE;
        else return FALSE;
    }

    //获取栈的长度
    int StackLength(Stack S) {
        return S.top - S.base;
    }

    //获取栈顶元素
    Status GetTop(Stack S, ElemType &e) {
        if (S.top == S.base) return ERROR;
        e = *(S.top - 1);

        return OK;
    }

    //将元素压入栈
    Status Push(Stack &S, ElemType e) {
        if (S.top - S.base == S.stackSize) return ERROR;
//        *S.top = e;
//        S.top++;
        *S.top++ = e;

        return OK;
    }

    //弹出栈顶元素
    Status Pop(Stack &S, ElemType &e) {
        if (isEmpty(S)) return ERROR;
//        --S.top;
//        e = *S.top;
        e = *--S.top; //先自减再赋值

        return OK;
    }

};

//链式栈的实现
class LinkedStack {

public:

    typedef struct StackNode {
        ElemType data;
        StackNode *next;
    } StackNode, *LinkStack;

    //初始化
    Status InitStack(LinkStack &S) {
        S = nullptr;

        return OK;
    }

    Status IsEmpty(LinkStack S) {
        if (S == nullptr) return TRUE;
        else return FALSE;
    }

    //元素入栈(头插法)
    Status Push(LinkStack &S, ElemType e) {
        auto *node = new StackNode;
        node->data = e;
        node->next = S;
        S = node;

        return OK;
    }

    Status Pop(LinkStack &S, ElemType &e) {
        if (S == nullptr) return ERROR;
        e = S->data;
        StackNode *node = S;
        S = S->next;
        delete node;

        return OK;
    }

    ElemType GetTop(LinkStack S) {
        if (S != nullptr) return S->data;
        return ERROR;
    }

    int GetLength(LinkStack S) {
        int i = 0;
        StackNode *p = S;
        while (p) {
            i++;
            p = p->next;
        }

        return i;
    }

    Status ClearStack(LinkStack &S) {
        StackNode *p = S;
        while (p) {
            StackNode *q = p;
            p = p->next;
            delete q;
        }

        return OK;
    }

    Status DestroyStack(LinkStack &S) {
        if (S) {
            StackNode *p = S;
            S = S->next;
            delete p;
        }

        return OK;
    }

};
