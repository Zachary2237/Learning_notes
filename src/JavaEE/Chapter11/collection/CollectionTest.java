// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CollectionTest.java

package Chapter11.collection;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package Chapter11.collection:
//            Person

public class CollectionTest
{

    public CollectionTest()
    {
    }

    public void test1()
    {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(Integer.valueOf(123));
        coll.add("Bb");
        coll.add(new Date());
        System.out.println(coll.size());
        Collection coll1 = new ArrayList();
        coll.add("CC");
        coll.add(Integer.valueOf(235));
        coll.add("KK");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
        System.out.println(coll.isEmpty());
        boolean contains = coll.contains(Integer.valueOf(235));
        System.out.println(contains);
        coll.add(new Person("Jerry", 18));
        System.out.println(coll.contains(new Person("Jerry", 18)));
        Collection coll2 = Arrays.asList(new Integer[] {
            Integer.valueOf(123), Integer.valueOf(235)
        });
        System.out.println(coll.containsAll(coll2));
        Collection coll3 = Arrays.asList(new Integer[] {
            Integer.valueOf(123), Integer.valueOf(235), Integer.valueOf(789)
        });
        coll.retainAll(coll3);
        System.out.println(coll);
        Object objects[] = coll.toArray();
        for(int i = 0; i < objects.length; i++)
            System.out.println(objects[i]);

        java.util.List list = Arrays.asList(new String[] {
            "QQ", "!!", "BB"
        });
        System.out.println(list);
    }
}
