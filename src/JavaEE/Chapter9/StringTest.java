// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringTest.java

package Chapter9;


public class StringTest
{

    public StringTest()
    {
    }

    public void test1()
    {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";
        String s = s1.replace("c", "a");
    }
}
