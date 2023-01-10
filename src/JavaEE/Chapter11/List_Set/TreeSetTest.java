// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TreeSetTest.java

package Chapter11.List_Set;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package Chapter11.List_Set:
//            User

public class TreeSetTest
{

    public TreeSetTest()
    {
    }

    public void test1()
    {
        TreeSet set = new TreeSet();
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 18));
        set.add(new User("Don", 33));
        set.add(new User("Jack", 28));
        set.add(new User("Jack", 38));
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }

    public void test2()
    {
        Comparator com = new Comparator() {

            public int compare(Object o1, Object o2)
            {
                if((o1 instanceof User) && (o2 instanceof User))
                {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else
                {
                    throw new RuntimeException("error");
                }
            }

            final TreeSetTest this$0;

            
            {
                this.this$0 = TreeSetTest.this;
                super();
            }
        }
;
        TreeSet set = new TreeSet(com);
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 18));
        set.add(new User("Don", 33));
        set.add(new User("Jack", 28));
        set.add(new User("Jack", 38));
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(iterator.next()));
    }
}
