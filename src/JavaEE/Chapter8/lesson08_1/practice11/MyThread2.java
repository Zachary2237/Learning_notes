// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadDemo.java

package Chapter8.lesson08_1.practice11;

import java.io.PrintStream;

class MyThread2 extends Thread
{

    MyThread2()
    {
    }

    public void run()
    {
        for(int i = 0; i < 100; i++)
            if(i % 2 == 1)
                System.out.println(i);

    }
}