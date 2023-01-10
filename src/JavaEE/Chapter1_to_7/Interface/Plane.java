// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InterfaceTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            Flyable

class Plane
    implements Flyable
{

    Plane()
    {
    }

    public void fly()
    {
        System.out.println("\u901A\u8FC7\u5F15\u64CE\u8D77\u98DE");
    }

    public void stop()
    {
        System.out.println("\u9A7E\u9A76\u5458\u51CF\u901F\u505C\u6B62");
    }
}
