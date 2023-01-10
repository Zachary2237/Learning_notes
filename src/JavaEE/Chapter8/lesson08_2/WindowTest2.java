// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WindowTest2.java

package Chapter8.lesson08_2;


// Referenced classes of package Chapter8.lesson08_2:
//            Window2

public class WindowTest2
{

    public WindowTest2()
    {
    }

    public static void main(String args[])
    {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();
        w1.setName("\u7A97\u53E31");
        w2.setName("\u7A97\u53E32");
        w3.setName("\u7A97\u53E33");
        w1.start();
        w2.start();
        w3.start();
    }
}
