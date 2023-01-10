// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EqualsTest.java

package Chapter1_to_7.Practice.practice4;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice4:
//            MyDate

public class EqualsTest
{

    public EqualsTest()
    {
    }

    public static void main(String args[])
    {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if(m1 == m2)
            System.out.println("m1 == m2");
        else
            System.out.println("m1 != m2");
        if(m1.equals(m2))
            System.out.println("m1 is equal to m2");
        else
            System.out.println("m1 is not equal to m2");
    }
}
