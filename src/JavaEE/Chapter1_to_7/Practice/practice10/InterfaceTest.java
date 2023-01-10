// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InterfaceTest.java

package Chapter1_to_7.Practice.practice10;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice10:
//            ComparableCircle

public class InterfaceTest
{

    public InterfaceTest()
    {
    }

    public static void main(String args[])
    {
        ComparableCircle c1 = new ComparableCircle(3.3999999999999999D);
        ComparableCircle c2 = new ComparableCircle(3.6000000000000001D);
        int compareValue = c1.compareTo(c2);
        if(compareValue > 0)
            System.out.println("c1\u5927");
        else
        if(compareValue < 0)
            System.out.println("c2\u5927");
        else
            System.out.println("\u4E00\u6837\u5927");
    }
}
