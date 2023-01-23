/**
 * Author: wxh
 * Date: 2023/1/19
 * Desc:
 *
 */

#include "Predefined.h"

#define MAXSIZE 255



class SString {

public:

    typedef struct {
        char ch[MAXSIZE + 1];
        int length;
    } String ;

    int index_BF(String S, String T, int pos = 1) {

        int i = pos, j = 1;
        while (i <= S.length && j <= T.length) {
            if (S.ch[i] == T.ch[j]) { i++, j++; }
            else {
                i = i - j + 2;
                j = 1;
            }
        }
        if (j > T.length) return i - T.length;
        else return 0;

    }

    int index_KMP(String S, String T, int pos = 1) {
        int i = pos, j = 1;
        int next[T.length];
        getNext(T, next);
        while (i <= S.length && j <= T.length) {
            if (j == 0 || S.ch[i] == S.ch[j]) {
                i++;
                j++;
            } else {
                j = next[j];
                //j = nextVal[j];
            }
        }

        if (j > T.length) return i - T.length;
        else return 0;
    }

    void getNext(String T, int next[]) {
        int i = 1;
        next[1] = 0;
        int j = 0;
        while (i < T.length) {
            if (j == 0 || T.ch[i] == T.ch[j]) { ++i; ++j; next[i] = j; }
            else j = next[j];
        }
    }

    void getNextVal(String T, int nextVal[]) {
        int i = 1, j = 0;
        nextVal[1] = 0;
        while (i < T.length) {
            if (j == 0 || T.ch[i] == T.ch[j]) {
                i++, j++;
                if (T.ch[i] != T.ch[j]) nextVal[i] = j;
                else nextVal[i] = nextVal[j];
            }
            else j = nextVal[j];
        }
    }

};

//
//class SqString {
//
//public:
//
//    typedef char String[MAXSIZE + 1];
//
//    int index(String S, String T, int pos = 1) {
//        int i = pos;
//        int j = 1;
//        while (i <= S[0] && j <= T[0]) {
//            if (S[i] == S[j]) {
//                i++; j++;
//            } else {
//                i = i - j + 2;
//                j = 1;
//            }
//        }
//
//        if (j > T[0]) return i - T[0];
//        else return 0;
//
//    }
//
//
//};


int main() {

    SString::String S;
    S.length = 4;
    strcpy(S.ch, "ccbaa");

    SString::String T;
    T.length = 3;
    T.ch[1] = 'c';
    T.ch[2] = 'b';
    T.ch[3] = 'a';

    SString ss;
    std::cout << ss.index_BF(S, T) << "\n";


    return 0;
}