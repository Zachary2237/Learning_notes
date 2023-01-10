// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxyTest.java

package Chapter15.Proxy;


// Referenced classes of package Chapter15.Proxy:
//            NikeClothFactory, ProxyClothFactory

public class StaticProxyTest
{

    public StaticProxyTest()
    {
    }

    public static void main(String args[])
    {
        NikeClothFactory nike = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
