// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductTest.java

package Chapter8.lesson08_2.practice13;


// Referenced classes of package Chapter8.lesson08_2.practice13:
//            Clerk, Productor, Customer

public class ProductTest
{

    public ProductTest()
    {
    }

    public static void main(String args[])
    {
        Clerk clerk = new Clerk();
        Productor p1 = new Productor(clerk);
        Productor p2 = new Productor(clerk);
        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);
        Thread t1 = new Thread(p1);
        t1.setName("\u751F\u4EA7\u80051");
        Thread t3 = new Thread(c1);
        t3.setName("\u6D88\u8D39\u80051");
        t1.start();
        t3.start();
    }
}
