// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RandomAccessFileTest.java

package Chapter13;

import java.io.*;

public class RandomAccessFileTest
{

    public RandomAccessFileTest()
    {
    }

    public void test1()
        throws FileNotFoundException
    {
        RandomAccessFile r1 = new RandomAccessFile(new File("Hello.txt"), "r");
        RandomAccessFile r2 = new RandomAccessFile(new File("Hello1.txt"), "rw");
    }
}
