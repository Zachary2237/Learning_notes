// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KidsTest.java

package Chapter1_to_7.Practice.practice1;

import java.io.PrintStream;

class Mankind
{

    public Mankind()
    {
    }

    void manOrWoman()
    {
        if(sex == 1)
            System.out.println("Man");
        else
        if(sex == 0)
            System.out.println("Woman");
    }

    void employeed()
    {
        if(salary == 0)
            System.out.println("No job");
        else
            System.out.println("Job");
    }

    int sex;
    int salary;
}
