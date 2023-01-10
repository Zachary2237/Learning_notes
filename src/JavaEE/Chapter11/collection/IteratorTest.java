// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IteratorTest.java

package Chapter11.collection;

import java.io.PrintStream;
import java.util.*;

public class IteratorTest
{

    public IteratorTest()
    {
    }

    public void test1()
    {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(Integer.valueOf(123));
        coll.add("Bb");
        coll.add(new Date());
        for(Iterator iterator = coll.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }

    public void test2()
    {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(Integer.valueOf(123));
        coll.add("Bb");
        coll.add(new Date());
        Iterator iterator = coll.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object obj = iterator.next();
            if("AA".equals(obj))
                iterator.remove();
        } while(true);
    }
}
