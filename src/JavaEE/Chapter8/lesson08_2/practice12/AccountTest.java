// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AccountTest.java

package Chapter8.lesson08_2.practice12;


// Referenced classes of package Chapter8.lesson08_2.practice12:
//            Account

public class AccountTest
{

    public AccountTest()
    {
    }

    public static void main(String args[])
    {
        Account account = new Account();
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.setName("\u50A8\u62371");
        t2.setName("\u50A8\u62372");
        t1.start();
        t2.start();
    }
}
