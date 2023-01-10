// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   USBTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            Computer, Flash, Printer, USB

public class USBTest
{

    public USBTest()
    {
    }

    public static void main(String args[])
    {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transfeiData(flash);
        computer.transfeiData(new Printer());
        USB phone = new USB() {

            public void start()
            {
                System.out.println("\u624B\u673A\u5F00\u673A");
            }

            public void stop()
            {
                System.out.println("\u624B\u673A\u5173\u673A");
            }

        }
;
        computer.transfeiData(phone);
        computer.transfeiData(new USB() {

            public void start()
            {
                System.out.println("MP3\u5F00\u673A");
            }

            public void stop()
            {
                System.out.println("MP3\u5173\u673A");
            }

        }
);
    }
}
