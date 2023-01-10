// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadPool.java

package Chapter8.lesson08_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package Chapter8.lesson08_2:
//            NumberThread

public class ThreadPool
{

    public ThreadPool()
    {
    }

    public static void main(String args[])
    {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new NumberThread());
        service.shutdown();
    }
}
