// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReflectionTest.java

package Chapter15.Part2;

import Chapter15.Part2.test.Person1;
import java.io.PrintStream;
import java.lang.reflect.*;

public class ReflectionTest
{

    public ReflectionTest()
    {
    }

    public void testField()
        throws Exception
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Person1 p = (Person1)clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        Field id = clazz.getField("id");
        id.set(p, Integer.valueOf(1001));
        int pId = ((Integer)id.get(p)).intValue();
        System.out.println(pId);
    }

    public void testField1()
        throws Exception
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Person1 p = (Person1)clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "Tom");
        System.out.println(name.get(p));
    }

    public void testMethod()
        throws Exception
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Person1 p = (Person1)clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        Method show = clazz.getDeclaredMethod("show", new Class[] {
            java/lang/String
        });
        show.setAccessible(true);
        Object chn = show.invoke(p, new Object[] {
            "CHN"
        });
        System.out.println(chn);
        System.out.println("**************");
        Method showDesc = clazz.getDeclaredMethod("showDesc", new Class[0]);
        showDesc.setAccessible(true);
        Object returnVal = showDesc.invoke(Chapter15/Part2/test/Person1, new Object[0]);
        System.out.println(returnVal);
    }

    public void testConstructor()
        throws Exception
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Constructor constructor = clazz.getDeclaredConstructor(new Class[] {
            java/lang/String
        });
        constructor.setAccessible(true);
        Person1 per = (Person1)constructor.newInstance(new Object[] {
            "Tom"
        });
        System.out.println(per);
    }
}
