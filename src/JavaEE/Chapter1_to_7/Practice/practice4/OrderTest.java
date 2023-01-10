// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderTest.java

package Chapter1_to_7.Practice.practice4;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice4:
//            Order

public class OrderTest
{

    public OrderTest()
    {
    }

    public static void main(String args[])
    {
        Order order1 = new Order(1001, "AA");
        Order order2 = new Order(1001, "BB");
        System.out.println(order1.equals(order2));
        Order order3 = new Order(1001, "BB");
        System.out.println(order2.equals(order3));
    }
}
