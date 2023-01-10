// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommunicationTest.java

package Chapter8.lesson08_2;


// Referenced classes of package Chapter8.lesson08_2:
//            Number

public class CommunicationTest
{

    public CommunicationTest()
    {
    }

    public static void main(String args[])
    {
        Number num = new Number();
        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);
        t1.setName("\u7EBF\u7A0B1");
        t2.setName("\u7EBF\u7A0B2");
        t1.start();
        t2.start();
    }
}
