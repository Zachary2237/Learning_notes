// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InetAddressTest.java

package Chapter14;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest
{

    public InetAddressTest()
    {
    }

    public static void main(String args[])
    {
        try
        {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            InetAddress baidu = InetAddress.getByName("www.baidu.com");
            System.out.println(baidu);
            System.out.println(inet1);
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println(localHost.getHostName());
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
    }
}
