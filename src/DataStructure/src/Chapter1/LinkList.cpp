/**
 * Author: wxh
 * Date: 2023/1/9
 * Desc:
 * 实现了单链表和双链表
 */

#include "Predefined.h"


typedef int Status;
typedef int ElemType;

using namespace std;

class SinglyLinkedList{
public:

    typedef struct LNode {
        ElemType data;
        struct LNode *next;
    } LNode, *LinkList;


    //单链表的初始化(带头节点的单链表)
    Status InitList(LinkList &L) {
        L = new LNode;
        L->next = NULL;
        return OK;
    }

    //判断链表是否为空
    int IsEmpty(LinkList L) {
        if (L->next) {
            return FALSE;
        } else {
            return TRUE;
        }
    }

    //销毁链表
    Status DestroyList(LinkList &L) {
        LNode *p;
        while (L) {
            p = L;
            L = L->next;
            delete p;
        }

        return OK;
    }

    //清空链表
    Status ClearList(LinkList &L) {
        LNode *p;
        LNode *q;

        p = L->next;
        while (p) {
            q = p->next;
            delete p;
            p = q;
        }

        L->next = nullptr;

        return OK;
    }

    //创建链表(头插法),倒序输入n个链表元素
    void CreateList(LinkList &L, int n) {
        InitList(L);
        while (n--) {
            LNode *node = new LNode;
            cin >> node->data;
            node->next = L->next;
            L->next = node;
        }

    }

    //创建链表(尾插法),正序输入n个链表元素
    void CreateList_(LinkList &L, int n) {
        InitList(L);
        LNode *tail = L;
        while (n--) {
            LNode *node = new LNode;
            cin >> node->data;
            node->next = nullptr;
            tail->next = node;
            tail = node;
        }

    }

    //获取链表长度
    int ListLength(LinkList L) {
        LNode *p;
        p = L->next;
        int len = 0;
        while (p) {
            len++;
            p = p->next;
        }

        return len;
    }

    //获取链表中第i个元素
    Status GetElem(LinkList L, int i, ElemType &e) {
        if (i < 1) return ERROR;
        LNode *p = L->next;
        int j = 1;
        while (p && j < i) {
            p = p->next;
            j++;
        }
        if (!p || j > i) return ERROR;
        e = p->data;
        return OK;

    }

    //查询元素在链表中的位置(返回元素位置)
    int LocateElem_(LinkList L, ElemType e) {
        LNode *p = L->next;
        int j = 1;
        while (p && p->data != e) {
            p = p->next;
        }
        if (p) return j;
        else return 0;
    }

    //查询元素在链表中的位置(返回地址)
    LNode *LocateElem(LinkList L, ElemType e) {
        LNode *p = L->next;
        while (p && p->data != e) {
            p = p->next;
        }
        return p;
    }

    //向链表中插入元素
    Status ListInsert(LinkList &L, int i, ElemType e) {
        int j = 0;
        LNode *p = L;
        while (p && j < i - 1) {
            p = p->next;
            j++;
        }
        if (!p || j > i - 1) return ERROR;
        LNode *node = new LNode;
        node->data = e;
        node->next = p->next;
        p->next = node;
        return OK;
    }

    //删除第i个节点
    Status ListDelete(LinkList &L, int i, ElemType &e) {
        int j = 0;
        LNode *p = L;
        while (p->next && j < i - 1) {
            p = p->next;
            j++;
        }
        if (!(p->next) || j > i - 1) return ERROR;
        LNode *q = p->next;
        e = q->data;
        p->next = q->next;
        delete q;

        return OK;
    }

    //合并两个有序链表
    LinkList MergeList(LinkList list1, LinkList list2) {
        LNode *list = new LNode;
        LNode *p = list;

        while (list1 && list2) {
            if (list1->data <= list2->data) {
                p->next = list1;
                p = list1;
                list1 = list1->next;
            } else {
                p->next = list2;
                p = list2;
                list2 = list2->next;
            }
        }

        if (list1) p->next = list1;
        else p->next = list2;

        return list->next;

    }


};

class DoubleLinkedList {
public:

    typedef struct DuLNode {
        ElemType data;
        struct DuLNode *prior;
        struct DuLNode *next;
    } DuLNode, *DuLinkList;

    ElemType GetElem(DuLinkList L, int index) {
        int i = 1;
        DuLNode *p = L->next;
        while (p) {
            if (i == index) break;
            i++;
            p = p->next;
        }
        if (p) return p->data;
        else return -1;
    }

    DuLNode *LocateElem(DuLinkList L, int index) {
        int i = 1;
        DuLNode *p = L->next;
        while (p && i < index) {
            p = p->next;
            i++;
        }

        if (p) return p;
        else return nullptr;
    }

    Status ListInsert(DuLinkList &L, int i, ElemType e) {
        DuLNode *p = LocateElem(L, i);
        if (!p) return ERROR;
        DuLNode *node = new DuLNode;
        node->data = e;
        node->prior = p->prior;
        p->prior->next = node;
        node->next = p;
        p->prior = node;

        return OK;
    }

    Status ListDelete(DuLinkList &L, int i, ElemType &e) {
        DuLNode *p = LocateElem(L, i);
        if (!p) return ERROR;
        e = p->data;
        p->prior->next = p->next;
        p->next->prior = p->prior;
        delete p;

        return OK;
    }
};



int main() {
    SinglyLinkedList::LinkList L;

    return 0;
}
