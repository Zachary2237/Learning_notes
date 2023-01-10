// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericTest.java

package Chapter12;

import java.io.PrintStream;
import java.util.*;

public class GenericTest
{

    public GenericTest()
    {
    }

    public void test1()
    {
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(78));
        list.add(Integer.valueOf(67));
        list.add(Integer.valueOf(99));
        list.add(Integer.valueOf(65));
        int stuScore;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(stuScore))
        {
            Object score = iterator.next();
            stuScore = ((Integer)score).intValue();
        }

    }

    public void test2()
    {
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(78));
        list.add(Integer.valueOf(98));
        list.add(Integer.valueOf(45));
        int stuScore;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(stuScore))
            stuScore = ((Integer)iterator.next()).intValue();

    }

    public void test3()
    {
        HashMap map = new HashMap();
        map.put("Tom", Integer.valueOf(97));
        map.put("Jack", Integer.valueOf(98));
        map.put("Jeason", Integer.valueOf(87));
        Set entries = map.entrySet();
        for(Iterator iterator = entries.iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry e = (java.util.Map.Entry)iterator.next();
            String key = (String)e.getKey();
            Integer integer = (Integer)e.getValue();
        }

    }
}
