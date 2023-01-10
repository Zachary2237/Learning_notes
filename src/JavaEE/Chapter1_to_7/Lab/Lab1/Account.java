// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Account.java

package Chapter1_to_7.Lab.Lab1;

import java.io.PrintStream;

public class Account
{

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest()
    {
        double MonthlyInterest = annualInterestRate / 12D;
        return MonthlyInterest;
    }

    public void withdraw(double amount)
    {
        if(balance < amount)
        {
            System.out.println("\u4F59\u989D\u4E0D\u8DB3!");
        } else
        {
            balance -= amount;
            System.out.println("\u53D6\u6B3E\u6210\u529F!");
        }
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("\u5B58\u6B3E\u6210\u529F!");
    }

    private int id;
    protected double balance;
    private double annualInterestRate;
}
