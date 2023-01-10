// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductTest.java

package Chapter8.lesson08_2.practice13;

import java.io.PrintStream;

// Referenced classes of package Chapter8.lesson08_2.practice13:
//            Clerk

class Productor
    implements Runnable
{

    public Productor(Clerk clerk)
    {
        this.clerk = clerk;
    }

    public void run()
    {
        System.out.println("\u5F00\u59CB\u751F\u4EA7");
        do
            clerk.addProduct();
        while(true);
    }

    private Clerk clerk;
}
