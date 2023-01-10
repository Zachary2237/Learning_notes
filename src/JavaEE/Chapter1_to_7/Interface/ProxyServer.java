// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NetWorkTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            NetWork

class ProxyServer
    implements NetWork
{

    public ProxyServer(NetWork work)
    {
        this.work = work;
    }

    public void check()
    {
        System.out.println("\u8054\u7F51\u524D\u7684\u68C0\u67E5");
    }

    public void browse()
    {
        check();
        work.browse();
    }

    private NetWork work;
}
