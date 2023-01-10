// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NetWorkTest.java

package Chapter1_to_7.Interface;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Interface:
//            NetWork

class Server
    implements NetWork
{

    Server()
    {
    }

    public void browse()
    {
        System.out.println("\u771F\u5B9E\u7684\u670D\u52A1\u5668\u8BBF\u95EE\u7F51\u7EDC");
    }
}
