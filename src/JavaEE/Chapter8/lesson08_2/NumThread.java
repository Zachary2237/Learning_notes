// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadNew.java

package Chapter8.lesson08_2;

import java.util.concurrent.Callable;

class NumThread
    implements Callable
{

    NumThread()
    {
    }

    public Object call()
        throws Exception
    {
        int sum = 0;
        for(int i = 1; i <= 100; i++)
            if(i % 2 == 0)
                sum += i;

        return Integer.valueOf(sum);
    }
}
