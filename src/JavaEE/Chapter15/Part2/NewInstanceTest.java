// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewInstanceTest.java

package Chapter15.Part2;

import Chapter15.Part1.Person;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class NewInstanceTest
{

    public NewInstanceTest()
    {
    }

    public void test1()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        Class clazz = Chapter15/Part1/Person;
        Person person = (Person)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        System.out.println(person);
    }

    public void test2()
    {
        int num = (new Random()).nextInt(3);
        String classPath = "";
        switch(num)
        {
        case 0: // '\0'
            classPath = "java.util.Date";
            break;

        case 1: // '\001'
            classPath = "java.lang.Object";
            break;

        case 2: // '\002'
            classPath = "Cheaper15.Part1.Person";
            break;
        }
        try
        {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public Object getInstance(String classPath)
        throws Exception
    {
        Class clazz = Class.forName(classPath);
        return clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
