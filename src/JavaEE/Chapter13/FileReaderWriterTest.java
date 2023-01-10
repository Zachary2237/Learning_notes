// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileReaderWriterTest.java

package Chapter13;

import java.io.*;

public class FileReaderWriterTest
{

    public FileReaderWriterTest()
    {
    }

    public void testFileReader()
    {
        FileReader fr = null;
        File file = new File("Hello.txt");
        fr = new FileReader(file);
        int data;
        while((data = fr.read()) != -1) 
            System.out.println((char)data);
        IOException e;
        try
        {
            if(fr != null)
                fr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_108;
        e;
        e.printStackTrace();
        try
        {
            if(fr != null)
                fr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_108;
        Exception exception;
        exception;
        try
        {
            if(fr != null)
                fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public void testFileReader1()
    {
        FileReader fileReader = null;
        File file = new File("Hello.txt");
        fileReader = new FileReader(file);
        char chars[] = new char[5];
        int len;
        while((len = fileReader.read(chars)) != -1) 
        {
            String str = new String(chars, 0, len);
            System.out.print(str);
        }
        IOException e;
        try
        {
            fileReader.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_115;
        e;
        e.printStackTrace();
        try
        {
            fileReader.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_115;
        Exception exception;
        exception;
        try
        {
            fileReader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public void testFileWriter()
    {
        FileWriter fileWriter = null;
        File file = new File("hello1.txt");
        fileWriter = new FileWriter(file);
        fileWriter.write("I have a dream!");
        fileWriter.write("Hello friends!");
        IOException e;
        if(fileWriter != null)
            try
            {
                fileWriter.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_97;
        e;
        e.printStackTrace();
        if(fileWriter != null)
            try
            {
                fileWriter.close();
            }
            // Misplaced declaration of an exception variable
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_97;
        Exception exception;
        exception;
        if(fileWriter != null)
            try
            {
                fileWriter.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        throw exception;
    }

    public void testFileReaderFileWriter()
    {
        FileReader fr;
        FileWriter fw;
        fr = null;
        fw = null;
        File srcFile = new File("Hello.txt");
        File destFile = new File("hello2.txt");
        fr = new FileReader(srcFile);
        fw = new FileWriter(destFile);
        char chars[] = new char[5];
        int len;
        while((len = fr.read(chars)) != -1) 
            fw.write(chars, 0, len);
        IOException e;
        try
        {
            fw.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_166;
        e;
        e.printStackTrace();
        try
        {
            fw.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fr.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_166;
        Exception exception;
        exception;
        try
        {
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public void copyImage()
    {
        FileInputStream fi;
        FileOutputStream fo;
        fi = null;
        fo = null;
        File srcFile = new File("\u5403\u6C342.png");
        File destFile = new File("copy.png");
        fi = new FileInputStream(srcFile);
        fo = new FileOutputStream(destFile);
        byte img[] = new byte[5];
        int len;
        while((len = fi.read(img)) != -1) 
            fo.write(img, 0, len);
        IOException e;
        try
        {
            fi.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fo.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_166;
        e;
        e.printStackTrace();
        try
        {
            fi.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fo.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_166;
        Exception exception;
        exception;
        try
        {
            fi.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fo.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }
}
