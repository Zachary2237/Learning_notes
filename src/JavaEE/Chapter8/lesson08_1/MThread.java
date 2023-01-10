// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadTest1.java

package Chapter8.lesson08_1;

import java.io.PrintStream;

class MThread
    implements Runnable
{

    MThread()
    {
    }

    public void run()
    {
        for(int i = 0; i < 100; i++)
            if(i % 2 == 0)
                System.out.println(i);

    }
}
