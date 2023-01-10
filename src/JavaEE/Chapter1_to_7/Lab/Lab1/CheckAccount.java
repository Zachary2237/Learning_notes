// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CheckAccount.java

package Chapter1_to_7.Lab.Lab1;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Lab.Lab1:
//            Account

public class CheckAccount extends Account
{

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft)
    {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft()
    {
        return overdraft;
    }

    public void withdraw(double amount)
    {
        if(amount <= getBalance())
            balance = getBalance() - amount;
        if(amount > getBalance())
        {
            double needMoney = amount - getBalance();
            if(overdraft >= needMoney)
            {
                overdraft -= needMoney;
                balance = 0.0D;
            } else
            {
                System.out.println("\u8D85\u8FC7\u53EF\u900F\u652F\u9650\u989D!");
            }
        }
    }

    private double overdraft;
}
