// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CompareTest.java

package Chapter9;

import java.io.PrintStream;
import java.util.Arrays;

public class CompareTest
{

    public CompareTest()
    {
    }

    public void test1()
    {
        String arr[] = {
            "AA", "CC", "KK", "BB", "DD", "GG"
        };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
