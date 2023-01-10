// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   USBTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            USB

class Flash
    implements USB
{

    Flash()
    {
    }

    public void start()
    {
        System.out.println("U\u76D8\u5F00\u59CB\u5DE5\u4F5C");
    }

    public void stop()
    {
        System.out.println("U\u76D8\u7ED3\u675F\u5DE5\u4F5C");
    }
}
