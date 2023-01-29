/*
 * @Author: wxh
 * @Date: 2023-01-25 14:21:31
 * @Description: 
 */

#include "Chapter1/Predefined.h"
#include "stack"

typedef ElemType int;

typedef struct TreeNode {
    ElemType data;
    TreeNode *left, *right;
} TreeNode, *BiTree;

class BinaryTree {

public:



    void PreOrderTraverse(TreeNode *root, vector<int> &vec) {
        if (root == nullptr) return;

        vec.push_back(root->data);
        PreOrderTraverse(root->left, vec);
        PreOrderTraverse(root->right, vec);

    }

    void _InOrderTraverse(TreeNode *root, std::vector<int> &vec) {
        std::stack<TreeNode *> s;
        TreeNode *p = root;
        while (p || !s.empty()) {
            if (p) {
                s.push(p);
                p = p->left;
            } else {
                TreeNode *q = s.top();
                s.pop();
                vec.push_back(q->data);
                p = q->right;
            }
        }
    }

    void InOrderTraverse(TreeNode *root, vector<int> &vec) {
        if (root == nullptr) return;
        
        InOrderTraverse(root->left, vec);
        vec.push_back(root->data);
        InOrderTraverse(root->right, vec);
    }

};

int main() {

    TreeNode tree;


    return 0;
}