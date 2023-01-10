// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OtherTest.java

package Chapter15.Part2;

import Chapter15.Part2.test.Person1;
import java.io.PrintStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest
{

    public OtherTest()
    {
    }

    public void test1()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        java.lang.reflect.Constructor constructors[] = clazz.getConstructors();
        java.lang.reflect.Constructor declaredConstructors[] = constructors;
        int i = declaredConstructors.length;
        for(int j = 0; j < i; j++)
        {
            java.lang.reflect.Constructor c = declaredConstructors[j];
            System.out.println(c);
        }

        System.out.println("***********");
        declaredConstructors = clazz.getDeclaredConstructors();
        java.lang.reflect.Constructor aconstructor[] = declaredConstructors;
        int k = aconstructor.length;
        for(int l = 0; l < k; l++)
        {
            java.lang.reflect.Constructor c = aconstructor[l];
            System.out.println(c);
        }

    }

    public void test2()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    public void test3()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
        ParameterizedType paramType = (ParameterizedType)genericSuperclass;
        Type actualTypeArguments[] = paramType.getActualTypeArguments();
        Type atype[] = actualTypeArguments;
        int i = atype.length;
        for(int j = 0; j < i; j++)
        {
            Type t = atype[j];
            System.out.println(t.getTypeName());
        }

    }

    public void test4()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Class interfaces[] = clazz.getInterfaces();
        Class interfaces1[] = interfaces;
        int i = interfaces1.length;
        for(int j = 0; j < i; j++)
        {
            Class c = interfaces1[j];
            System.out.println(c);
        }

        System.out.println();
        interfaces1 = clazz.getSuperclass().getInterfaces();
        Class aclass[] = interfaces1;
        int k = aclass.length;
        for(int l = 0; l < k; l++)
        {
            Class c = aclass[l];
            System.out.println(c);
        }

    }

    public void test5()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    public void test6()
    {
        Class clazz = Chapter15/Part2/test/Person1;
        java.lang.annotation.Annotation annotations[] = clazz.getAnnotations();
        java.lang.annotation.Annotation aannotation[] = annotations;
        int i = aannotation.length;
        for(int j = 0; j < i; j++)
        {
            java.lang.annotation.Annotation a = aannotation[j];
            System.out.println(a);
        }

    }
}
