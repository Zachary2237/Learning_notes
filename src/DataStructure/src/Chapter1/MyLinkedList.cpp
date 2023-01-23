#include <algorithm>

/**
 * Author: wxh
 * Date: 2023/1/19
 * Desc:
 *
 */


struct DListNode {
    int val;
    DListNode *prev;
    DListNode *next;

    DListNode(int val) : val(val) {}
};

class MyLinkedList {
public:
    MyLinkedList() {
        this->size = 0;
        this->head = new DListNode(0);
        this->tail = new DListNode(0);
        head->next = tail;
        tail->prev = head;
    }

    int get(int index) {
        if (index < 0 || index > size) return -1;
        DListNode *cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur->next;
        }

        return cur->val;
    }

    DListNode* getNode(int index) {
        if (index < 0 || index > size) return nullptr;
        DListNode *cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur->next;
        }

        return cur;
    }

    void addAtIndex(int index, int val) {
        if (index > size) return;
        index = std::max(0, index);
        DListNode *cur = getNode(index);
        DListNode *node = new DListNode(val);
        node->prev = cur->prev;
        cur->prev->next = node;
        node->next = cur;
        cur->prev = node;
        size++;
    }

    void deleteAtIndex(int index) {
        if (index < 0 || index > size) return;
        DListNode *cur = getNode(index);
        cur->prev->next = cur->next;
        cur->next->prev = cur->prev;
        delete cur;
        size--;
    }

private:
    int size;
    DListNode *head;
    DListNode *tail;
};