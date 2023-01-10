// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericTest1.java

package Chapter12;


// Referenced classes of package Chapter12:
//            Order, SubOrder

public class GenericTest1
{

    public GenericTest1()
    {
    }

    public void test1()
    {
        Order order = new Order("orderAA", 1001, "order:AA");
        order.setOrderT("AA: hello");
    }

    public void test2()
    {
        SubOrder subOrder = new SubOrder();
    }
}
