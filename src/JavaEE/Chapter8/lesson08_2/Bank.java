// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BankTest.java

package Chapter8.lesson08_2;


class Bank
{

    private Bank()
    {
    }

    public static Bank getInstance()
    {
        if(instance == null)
            synchronized(Chapter8/lesson08_2/Bank)
            {
                if(instance == null)
                    instance = new Bank();
            }
        return instance;
    }

    private static Bank instance = null;

}
