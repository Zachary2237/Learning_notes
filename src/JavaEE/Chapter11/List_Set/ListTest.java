// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ListTest.java

package Chapter11.List_Set;

import java.io.PrintStream;
import java.util.*;

public class ListTest
{

    public ListTest()
    {
    }

    public void test1()
    {
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(123));
        list.add(Integer.valueOf(456));
        list.add("AA");
        list.add(Integer.valueOf(456));
        System.out.println(list);
        list.add(1, "Bb");
        System.out.println(list);
        java.util.List list1 = Arrays.asList(new Integer[] {
            Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
        });
        list.addAll(list1);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }

    public void test2()
    {
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(123));
        list.add(Integer.valueOf(456));
        list.add("AA");
        list.add(Integer.valueOf(456));
        System.out.println(list);
        int index = list.indexOf(Integer.valueOf(4567));
        System.out.println(index);
        int lastIndex = list.lastIndexOf(Integer.valueOf(456));
        System.out.println(lastIndex);
        Object obj = list.remove(1);
        System.out.println(obj);
        System.out.println(list);
        list.set(1, "EE");
        System.out.println(list);
        java.util.List subList = list.subList(0, 2);
        System.out.println(subList);
    }

    public void test3()
    {
        ArrayList list = new ArrayList();
        list.add(Integer.valueOf(123));
        list.add(Integer.valueOf(456));
        list.add("AA");
        list.add(Integer.valueOf(456));
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
        System.out.println("**********");
        Object obj;
        for(Iterator iterator1 = list.iterator(); iterator1.hasNext(); System.out.println(obj))
            obj = iterator1.next();

        System.out.println("**********");
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
