// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadNew.java

package Chapter8.lesson08_2;

import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package Chapter8.lesson08_2:
//            NumThread

public class ThreadNew
{

    public ThreadNew()
    {
    }

    public static void main(String args[])
    {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        (new Thread(futureTask)).start();
        try
        {
            Object obj = futureTask.get();
            System.out.println(obj);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        catch(ExecutionException e)
        {
            e.printStackTrace();
        }
    }
}
