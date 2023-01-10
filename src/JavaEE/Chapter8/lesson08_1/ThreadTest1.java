// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadTest1.java

package Chapter8.lesson08_1;


// Referenced classes of package Chapter8.lesson08_1:
//            MThread

public class ThreadTest1
{

    public ThreadTest1()
    {
    }

    public static void main(String args[])
    {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.start();
        Thread t2 = new Thread(mThread);
        t2.start();
    }
}
