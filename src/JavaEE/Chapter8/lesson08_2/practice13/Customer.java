// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductTest.java

package Chapter8.lesson08_2.practice13;

import java.io.PrintStream;

// Referenced classes of package Chapter8.lesson08_2.practice13:
//            Clerk

class Customer
    implements Runnable
{

    public Customer(Clerk clerk)
    {
        this.clerk = clerk;
    }

    public void run()
    {
        System.out.println("\u6D88\u8D39\u8005\u5F00\u59CB\u6D88\u8D39");
        do
            clerk.decreaseProduct();
        while(true);
    }

    private Clerk clerk;
}
