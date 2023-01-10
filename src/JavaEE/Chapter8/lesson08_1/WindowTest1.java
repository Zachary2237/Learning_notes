// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WindowTest1.java

package Chapter8.lesson08_1;


// Referenced classes of package Chapter8.lesson08_1:
//            Window1

public class WindowTest1
{

    public WindowTest1()
    {
    }

    public static void main(String args[])
    {
        Window1 w1 = new Window1();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("\u7A97\u53E31");
        t2.setName("\u7A97\u53E32");
        t3.setName("\u7A97\u53E33");
        t1.start();
        t2.start();
        t3.start();
    }
}
