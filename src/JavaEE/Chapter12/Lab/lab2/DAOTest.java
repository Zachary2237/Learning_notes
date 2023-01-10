// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DAOTest.java

package Chapter12.Lab.lab2;

import java.io.PrintStream;

// Referenced classes of package Chapter12.Lab.lab2:
//            DAO, User

public class DAOTest
{

    public DAOTest()
    {
    }

    public void test()
    {
        DAO dao = new DAO();
        dao.save("A", new User(1, 18, "Tom"));
        dao.save("B", new User(2, 20, "Jack"));
        dao.save("C", new User(3, 18, "Rose"));
        System.out.println(dao.get("B"));
        System.out.println(dao.get("C"));
        dao.update("D", new User(3, 19, "Rose"));
        System.out.println(dao.list());
        dao.delete("B");
        System.out.println(dao.list());
    }
}
