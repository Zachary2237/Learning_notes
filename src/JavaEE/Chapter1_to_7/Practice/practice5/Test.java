// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Test.java

package Chapter1_to_7.Practice.practice5;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Practice.practice5:
//            Circle

public class Test
{

    public Test()
    {
    }

    public static void main(String args[])
    {
        Circle cir1 = new Circle(1.0D, "black", 2D);
        Circle cir2 = new Circle(1.0D, "white", 2D);
        System.out.println(cir1.getColor().equals(cir2.getColor()));
        System.out.println(cir1.equals(cir2));
        System.out.println(cir1.toString());
        System.out.println(cir2.toString());
        System.out.println(cir1);
    }
}
