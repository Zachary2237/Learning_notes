// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Employee.java

package Chapter1_to_7.Practice.practice9;


public abstract class Employee
{

    public Employee()
    {
    }

    public Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    private String name;
    private int id;
    private double salary;
}
