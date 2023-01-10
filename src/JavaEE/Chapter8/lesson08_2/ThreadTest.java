// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadTest.java

package Chapter8.lesson08_2;

import java.io.PrintStream;

public class ThreadTest
{

    public ThreadTest()
    {
    }

    public static void main(String args[])
    {
        final StringBuffer s1 = new StringBuffer();
        final StringBuffer s2 = new StringBuffer();
        (new Thread() {

            public void run()
            {
                synchronized(s1)
                {
                    s1.append("a");
                    s2.append("1");
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    synchronized(s2)
                    {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }

            final StringBuffer val$s1;
            final StringBuffer val$s2;

            
            {
                s1 = stringbuffer;
                s2 = stringbuffer1;
                super();
            }
        }
).start();
        (new Thread(new Runnable() {

            public void run()
            {
                synchronized(s2)
                {
                    s1.append("c");
                    s2.append("3");
                    synchronized(s1)
                    {
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }

            final StringBuffer val$s2;
            final StringBuffer val$s1;

            
            {
                s2 = stringbuffer;
                s1 = stringbuffer1;
                super();
            }
        }
)).start();
    }
}
