// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EmployeeTest.java

package Chapter1_to_7.Practice.practice9;


// Referenced classes of package Chapter1_to_7.Practice.practice9:
//            Manager, Employee, CommonEmployee

public class EmployeeTest
{

    public EmployeeTest()
    {
    }

    public static void main(String args[])
    {
        Employee manager = new Manager("kook", 1001, 5000D, 50000D);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
