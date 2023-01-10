// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SetTest.java

package Chapter11.List_Set;

import java.io.PrintStream;
import java.util.*;

public class SetTest
{

    public SetTest()
    {
    }

    public void test1()
    {
        Set set = new HashSet();
        set.add(Integer.valueOf(456));
        set.add(Integer.valueOf(123));
        set.add("AA");
        set.add("CC");
        set.add(Integer.valueOf(129));
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }

    public void test2()
    {
        Set set = new LinkedHashSet();
        set.add(Integer.valueOf(456));
        set.add(Integer.valueOf(123));
        set.add("AA");
        set.add("CC");
        set.add(Integer.valueOf(129));
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }
}
