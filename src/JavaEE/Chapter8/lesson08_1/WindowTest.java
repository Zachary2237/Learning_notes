// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WindowTest.java

package Chapter8.lesson08_1;


// Referenced classes of package Chapter8.lesson08_1:
//            Window

public class WindowTest
{

    public WindowTest()
    {
    }

    public static void main(String args[])
    {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("\u7A97\u53E31");
        w2.setName("\u7A97\u53E32");
        w3.setName("\u7A97\u53E33");
        w1.start();
        w2.start();
        w3.start();
    }
}
