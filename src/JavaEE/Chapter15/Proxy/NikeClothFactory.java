// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxyTest.java

package Chapter15.Proxy;

import java.io.PrintStream;

// Referenced classes of package Chapter15.Proxy:
//            ClothFactory

class NikeClothFactory
    implements ClothFactory
{

    NikeClothFactory()
    {
    }

    public void produceCloth()
    {
        System.out.println("Nike\u5DE5\u5382\u751F\u4EA7\u4E00\u6279\u8FD0\u52A8\u670D");
    }
}
