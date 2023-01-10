// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EcmDef.java

package Chapter1_to_7.Lab.Lab3;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Lab.Lab3:
//            EcDef

public class EcmDef
{

    public EcmDef()
    {
    }

    public static void main(String args[])
    {
        try
        {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int k = ecm(i, j);
        }
        catch(NumberFormatException e)
        {
            System.out.println("\u6570\u636E\u7C7B\u578B\u4E0D\u4E00\u81F4");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\u7F3A\u5C11\u547D\u4EE4\u884C\u53C2\u6570!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("\u96640");
        }
        catch(EcDef e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i, int j)
        throws EcDef
    {
        if(i < 0 || j < 0)
            throw new EcDef("\u5206\u5B50\u6216\u5206\u6BCD\u4E3A\u8D1F\u6570!");
        else
            return i / j;
    }
}
