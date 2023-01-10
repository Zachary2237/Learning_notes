// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   USBTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            USB

class Computer
{

    Computer()
    {
    }

    public void transfeiData(USB usb)
    {
        usb.start();
        System.out.println("\u5177\u4F53\u4F20\u8F93\u7684\u7EC6\u8282");
        usb.stop();
    }
}
