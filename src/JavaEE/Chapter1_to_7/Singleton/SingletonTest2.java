// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SingletonTest2.java

package Chapter1_to_7.Singleton;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Singleton:
//            Order

public class SingletonTest2
{

    public SingletonTest2()
    {
    }

    public static void main(String args[])
    {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order2 == order1);
    }
}
