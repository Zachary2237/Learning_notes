// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TCPTest2.java

package Chapter14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest2
{

    public TCPTest2()
    {
    }

    public void client()
        throws IOException
    {
        Socket socket = new Socket("192.168.101.18", 8989);
        OutputStream os = socket.getOutputStream();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("01.jpg"));
        byte buffer[] = new byte[1024];
        int len;
        while((len = bis.read(buffer)) != -1) 
            os.write(buffer, 0, len);
        bis.close();
        os.close();
        socket.close();
    }

    public void server()
        throws IOException
    {
        ServerSocket ss = new ServerSocket(8989);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("02.jpg"));
        byte buffer[] = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1) 
            bos.write(buffer, 0, len);
        bos.close();
        is.close();
        accept.close();
        ss.close();
    }
}
