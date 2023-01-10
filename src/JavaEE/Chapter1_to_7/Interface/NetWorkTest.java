// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NetWorkTest.java

package Chapter1_to_7.Interface;


// Referenced classes of package Chapter1_to_7.Interface:
//            Server, ProxyServer

public class NetWorkTest
{

    public NetWorkTest()
    {
    }

    public static void main(String args[])
    {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
