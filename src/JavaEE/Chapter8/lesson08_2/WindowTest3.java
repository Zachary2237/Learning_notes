// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WindowTest3.java

package Chapter8.lesson08_2;


// Referenced classes of package Chapter8.lesson08_2:
//            Window3

public class WindowTest3
{

    public WindowTest3()
    {
    }

    public static void main(String args[])
    {
        Window3 w1 = new Window3();
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
