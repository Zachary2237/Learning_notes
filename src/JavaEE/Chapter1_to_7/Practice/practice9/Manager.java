// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Manager.java

package Chapter1_to_7.Practice.practice9;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice9:
//            Employee

public class Manager extends Employee
{

    public void work()
    {
        System.out.println("\u7BA1\u7406\u5458\u5DE5,\u63D0\u9AD8\u5DE5\u4F5C\u6548\u7387");
    }

    public Manager(double bonus)
    {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus)
    {
        super(name, id, salary);
        this.bonus = bonus;
    }

    private double bonus;
}
