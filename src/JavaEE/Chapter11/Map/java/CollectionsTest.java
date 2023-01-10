// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CollectionsTest.java

package Chapter11.Map.java;

import java.io.PrintStream;
import java.util.*;

public class CollectionsTest
{

    public CollectionsTest()
    {
    }

    public void test1()
    {
        List list = new ArrayList();
        list.add(Integer.valueOf(123));
        list.add(Integer.valueOf(34));
        list.add(Integer.valueOf(678));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(-97));
        System.out.println(list);
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());
        Collections.copy(dest, list);
        System.out.println(dest);
    }
}
