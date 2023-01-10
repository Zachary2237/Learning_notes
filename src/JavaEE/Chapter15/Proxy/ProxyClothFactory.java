// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxyTest.java

package Chapter15.Proxy;

import java.io.PrintStream;

// Referenced classes of package Chapter15.Proxy:
//            ClothFactory

class ProxyClothFactory
    implements ClothFactory
{

    public ProxyClothFactory(ClothFactory factory)
    {
        this.factory = factory;
    }

    public void produceCloth()
    {
        System.out.println("\u4EE3\u7406\u5DE5\u5382\u505A\u4E00\u4E9B\u51C6\u5907\u5DE5\u4F5C");
        factory.produceCloth();
        System.out.println("\u4EE3\u7406\u5DE5\u5382\u505A\u4E00\u4E9B\u6536\u5C3E\u5DE5\u4F5C");
    }

    private ClothFactory factory;
}
