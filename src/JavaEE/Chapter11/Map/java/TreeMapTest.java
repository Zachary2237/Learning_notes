// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TreeMapTest.java

package Chapter11.Map.java;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package Chapter11.Map.java:
//            User

public class TreeMapTest
{

    public TreeMapTest()
    {
    }

    public void test1()
    {
        TreeMap map = new TreeMap(new Comparator() {

            public int compare(Object o1, Object o2)
            {
                if((o1 instanceof User) && (o2 instanceof User))
                {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else
                {
                    throw new RuntimeException("error!");
                }
            }

            final TreeMapTest this$0;

            
            {
                this.this$0 = TreeMapTest.this;
                super();
            }
        }
);
        User u1 = new User("Tom", 12);
        User u2 = new User("Jerry", 15);
        User u3 = new User("Jack", 28);
        User u4 = new User("Harry", 49);
        map.put(u1, Integer.valueOf(98));
        map.put(u2, Integer.valueOf(69));
        map.put(u3, Integer.valueOf(88));
        map.put(u4, Integer.valueOf(80));
        Set set = map.entrySet();
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }
}
