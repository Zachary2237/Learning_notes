// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SingletonTest1.java

package Chapter1_to_7.Singleton;


class Bank
{

    private Bank()
    {
    }

    public static Bank getInstance()
    {
        return instance;
    }

    private static Bank instance = new Bank();

}
