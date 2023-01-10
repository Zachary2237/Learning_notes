// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InstanceTest.java

package Chapter1_to_7.Practice.practice2;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice2:
//            Person, Graduate, Student

public class InstanceTest
{

    public InstanceTest()
    {
    }

    public void method(Person e)
    {
        String info = e.getInfo();
        System.out.println(info);
        if(e instanceof Graduate)
            System.out.println("a graduated student");
        if(e instanceof Student)
            System.out.println("a student");
        if(e instanceof Person)
            System.out.println("a person");
    }

    public static void main(String args[])
    {
        InstanceTest test = new InstanceTest();
        test.method(new Graduate());
    }
}
