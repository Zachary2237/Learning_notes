// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReflectionTest.java

package Chapter15.Part1;

import java.io.PrintStream;
import java.lang.reflect.*;

// Referenced classes of package Chapter15.Part1:
//            Person

public class ReflectionTest
{

    public ReflectionTest()
    {
    }

    public void test3()
        throws ClassNotFoundException
    {
        Class clazz1 = Chapter15/Part1/Person;
        System.out.println(clazz1);
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        Class clazz3 = Class.forName("Chapter15.Part1.Person");
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
        ClassLoader classLoader = Chapter15/Part1/ReflectionTest.getClassLoader();
        Class clazz4 = classLoader.loadClass("Chapter15.Part1.Person");
        System.out.println(clazz4);
        System.out.println(clazz1 == clazz4);
    }

    public void test1()
    {
        Person p1 = new Person("Tom", 18);
        p1.age = 10;
        System.out.println(p1);
        p1.show();
    }

    public void test2()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException
    {
        Class personClass = Chapter15/Part1/Person;
        Constructor cons = personClass.getConstructor(new Class[] {
            java/lang/String, Integer.TYPE
        });
        Person tom = (Person)cons.newInstance(new Object[] {
            "Tom", Integer.valueOf(12)
        });
        System.out.println(tom.toString());
        Field age = personClass.getDeclaredField("age");
        age.set(tom, Integer.valueOf(10));
        System.out.println(tom);
        Method show = personClass.getDeclaredMethod("show", new Class[0]);
        show.invoke(tom, new Object[0]);
        Constructor cons1 = personClass.getDeclaredConstructor(new Class[] {
            java/lang/String
        });
        cons1.setAccessible(true);
        Person jerry = (Person)cons1.newInstance(new Object[] {
            "Jerry"
        });
        System.out.println(jerry);
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(jerry, "Harry");
        System.out.println(jerry);
        Method showNation = personClass.getDeclaredMethod("showNation", new Class[] {
            java/lang/String
        });
        showNation.setAccessible(true);
        String nation = (String)showNation.invoke(jerry, new Object[] {
            "China"
        });
        System.out.println(nation);
    }
}
