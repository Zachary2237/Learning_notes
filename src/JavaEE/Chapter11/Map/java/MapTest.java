// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapTest.java

package Chapter11.Map.java;

import java.io.PrintStream;
import java.util.*;

public class MapTest
{

    public MapTest()
    {
    }

    public void test5()
    {
        Map map = new HashMap();
        map.put("AA", Integer.valueOf(123));
        map.put(Integer.valueOf(45), Integer.valueOf(123));
        map.put("BB", Integer.valueOf(56));
        Set set = map.keySet();
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
        System.out.println("********");
        Collection values = map.values();
        Object obj;
        for(Iterator iterator2 = values.iterator(); iterator2.hasNext(); System.out.println(obj))
            obj = iterator2.next();

        System.out.println("********");
        Set entrySet = map.entrySet();
        System.out.println("********");
        for(Iterator iterator1 = entrySet.iterator(); iterator1.hasNext(); System.out.println(iterator1.next()));
    }

    public void test4()
    {
        Map map = new HashMap();
        map.put("AA", Integer.valueOf(123));
        map.put(Integer.valueOf(45), Integer.valueOf(123));
        map.put("BB", Integer.valueOf(56));
        System.out.println(map.get(Integer.valueOf(45)));
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(Integer.valueOf(123)));
    }

    public void test3()
    {
        Map map = new HashMap();
        map.put("AA", Integer.valueOf(123));
        map.put(Integer.valueOf(45), Integer.valueOf(123));
        map.put("BB", Integer.valueOf(56));
        map.put("AA", Integer.valueOf(87));
        System.out.println(map);
        Map map1 = new HashMap();
        map1.put("CC", Integer.valueOf(123));
        map1.put("DD", Integer.valueOf(123));
        map.putAll(map1);
        System.out.println(map);
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);
        map.clear();
        System.out.println(map.size());
    }

    public void test1()
    {
        Map map = new HashMap();
        map = new Hashtable();
        map.put(null, null);
        System.out.println(map);
    }

    public void test2()
    {
        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(Integer.valueOf(123), "AA");
        map.put(Integer.valueOf(345), "BB");
        map.put(Integer.valueOf(12), "CC");
        System.out.println(map);
    }
}
