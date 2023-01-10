// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KidsTest.java

package Chapter1_to_7.Practice.practice1;


// Referenced classes of package Chapter1_to_7.Practice.practice1:
//            Kids

public class KidsTest
{

    public KidsTest()
    {
    }

    public static void main(String args[])
    {
        Kids someKid = new Kids();
        someKid.sex = 1;
        someKid.salary = 1000;
        someKid.yearsOld = 20;
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
