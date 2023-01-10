// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadDemo.java

package Chapter8.lesson08_1.practice11;


// Referenced classes of package Chapter8.lesson08_1.practice11:
//            MyThread1, MyThread2

public class ThreadDemo
{

    public ThreadDemo()
    {
    }

    public static void main(String args[])
    {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}
