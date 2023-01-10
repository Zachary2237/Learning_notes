// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LockTest.java

package Chapter8.lesson08_2;


// Referenced classes of package Chapter8.lesson08_2:
//            Window

public class LockTest
{

    public LockTest()
    {
    }

    public static void main(String args[])
    {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("Window1");
        t2.setName("Window2");
        t3.setName("Window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
