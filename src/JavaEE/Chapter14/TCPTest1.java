// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TCPTest1.java

package Chapter14;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class TCPTest1
{

    public TCPTest1()
    {
    }

    public void client()
    {
        Socket socket;
        OutputStream os;
        socket = null;
        os = null;
        InetAddress inet = InetAddress.getByName("192.168.101.18");
        socket = new Socket(inet, 8889);
        os = socket.getOutputStream();
        os.write("Hello, i'm client!".getBytes(StandardCharsets.UTF_8));
        IOException e;
        if(os != null)
            try
            {
                os.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_155;
        e;
        e.printStackTrace();
        if(os != null)
            try
            {
                os.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_155;
        Exception exception;
        exception;
        if(os != null)
            try
            {
                os.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        throw exception;
    }

    public void server()
    {
        ServerSocket ss;
        Socket socket;
        InputStream is;
        ByteArrayOutputStream baos;
        ss = null;
        socket = null;
        is = null;
        baos = null;
        ss = new ServerSocket(8889);
        socket = ss.accept();
        is = socket.getInputStream();
        baos = new ByteArrayOutputStream();
        byte buffer[] = new byte[10];
        int len;
        while((len = is.read(buffer)) != -1) 
            baos.write(buffer, 0, len);
        System.out.println(baos.toString());
        System.out.println(socket.getInetAddress().getHostAddress());
        IOException e;
        if(baos != null)
            try
            {
                baos.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(is != null)
            try
            {
                is.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(ss != null)
            try
            {
                ss.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_335;
        e;
        e.printStackTrace();
        if(baos != null)
            try
            {
                baos.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(is != null)
            try
            {
                is.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(ss != null)
            try
            {
                ss.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_335;
        Exception exception;
        exception;
        if(baos != null)
            try
            {
                baos.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(is != null)
            try
            {
                is.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(socket != null)
            try
            {
                socket.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(ss != null)
            try
            {
                ss.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        throw exception;
    }
}
