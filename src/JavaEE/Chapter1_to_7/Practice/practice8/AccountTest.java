// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AccountTest.java

package Chapter1_to_7.Practice.practice8;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice8:
//            Account

public class AccountTest
{

    public AccountTest()
    {
    }

    public static void main(String args[])
    {
        Account acct1 = new Account();
        Account acct2 = new Account("123456", 2000D);
        Account.setInterestRate(0.012D);
        Account.setMinMoney(100D);
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinMoney());
    }
}
