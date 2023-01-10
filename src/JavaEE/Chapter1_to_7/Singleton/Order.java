// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SingletonTest2.java

package Chapter1_to_7.Singleton;


class Order
{

    private Order()
    {
    }

    public static Order getInstance()
    {
        if(instance == null)
            instance = new Order();
        return instance;
    }

    private static Order instance = null;

}
