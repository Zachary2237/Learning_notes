// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InputStreamReaderTest.java

package Chapter13;

import java.io.*;

public class InputStreamReaderTest
{

    public InputStreamReaderTest()
    {
    }

    public void test1()
    {
        InputStreamReader isr = null;
        FileInputStream fis = new FileInputStream("Hello.txt");
        isr = new InputStreamReader(fis);
        char buf[] = new char[20];
        int len;
        while((len = isr.read(buf)) != -1) 
        {
            String str = new String(buf, 0, len);
            System.out.println(str);
        }
        IOException e;
        try
        {
            isr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_116;
        e;
        e.printStackTrace();
        try
        {
            isr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_116;
        Exception exception;
        exception;
        try
        {
            isr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }
}
