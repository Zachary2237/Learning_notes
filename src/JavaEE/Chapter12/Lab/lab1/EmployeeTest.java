// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EmployeeTest.java

package Chapter12.Lab.lab1;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package Chapter12.Lab.lab1:
//            Employee, MyDate

public class EmployeeTest
{

    public EmployeeTest()
    {
    }

    public void test1()
    {
        Employee e1 = new Employee("Tom", 18, new MyDate(12, 11, 2003));
        Employee e2 = new Employee("Jack", 22, new MyDate(8, 30, 2001));
        Employee e3 = new Employee("Harry", 27, new MyDate(4, 10, 2002));
        Employee e4 = new Employee("Marry", 20, new MyDate(6, 19, 1999));
        Employee e5 = new Employee("Rose", 24, new MyDate(5, 18, 2000));
        TreeSet employees = new TreeSet();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        Employee e;
        for(Iterator iterator = employees.iterator(); iterator.hasNext(); System.out.println(e))
            e = (Employee)iterator.next();

    }

    public void test2()
    {
        Employee e1 = new Employee("Tom", 18, new MyDate(12, 11, 2003));
        Employee e2 = new Employee("Jack", 22, new MyDate(8, 30, 2002));
        Employee e3 = new Employee("Harry", 27, new MyDate(4, 10, 2002));
        Employee e4 = new Employee("Marry", 20, new MyDate(6, 19, 1999));
        Employee e5 = new Employee("Rose", 24, new MyDate(5, 18, 2000));
        TreeSet employees = new TreeSet(new Comparator() {

            public int compare(Employee o1, Employee o2)
            {
                if(o1.getBirthday().getYear() != o2.getBirthday().getYear())
                    return Integer.compare(o1.getBirthday().getYear(), o2.getBirthday().getYear());
                if(o1.getBirthday().getMonth() != o2.getBirthday().getMonth())
                    return Integer.compare(o1.getBirthday().getMonth(), o2.getBirthday().getMonth());
                else
                    return Integer.compare(o1.getBirthday().getDay(), o2.getBirthday().getDay());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((Employee)obj, (Employee)obj1);
            }

            final EmployeeTest this$0;

            
            {
                this.this$0 = EmployeeTest.this;
                super();
            }
        }
);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        Employee e;
        for(Iterator iterator = employees.iterator(); iterator.hasNext(); System.out.println(e))
            e = (Employee)iterator.next();

    }
}
