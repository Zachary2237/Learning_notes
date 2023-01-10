// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileTest.java

package Chapter13;

import java.io.*;
import java.util.Arrays;

public class FileTest
{

    public FileTest()
    {
    }

    public void test1()
    {
        File file = new File("hello.txt");
    }

    public void test2()
    {
        File file = new File("hello.txt");
    }

    public void test3()
        throws IOException
    {
        File file = new File("Hello.txt");
        if(!file.exists())
        {
            file.createNewFile();
            System.out.println("Success");
        } else
        {
            System.out.println("1");
        }
    }

    public void test4()
    {
        File file = new File("D:\\io\\io1");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }

    public void test5()
        throws IOException
    {
        File file = new File("D:\\io\\io1");
        boolean newFile = file.mkdirs();
        if(newFile)
            System.out.println("Success");
        else
            System.out.println("Failed");
        String parent = file.getParent();
        System.out.println(parent);
        File file2 = new File(file.getPath(), "hello.txt");
        file2.createNewFile();
        File file1 = new File(parent, "nice.txt");
        boolean newFile1 = file1.createNewFile();
        if(newFile1)
            System.out.println("Success");
        else
            System.out.println("Failed");
        File fileDemo = new File("D:\\io");
        String list[] = fileDemo.list();
        String as[] = list;
        int i = as.length;
        for(int j = 0; j < i; j++)
        {
            String s = as[j];
            if(s.endsWith(".txt"))
                System.out.println(s);
        }

        System.out.println(Arrays.toString(list));
    }

    public void test6()
    {
        File path = new File("D:\\\u7A0B\u5E8F\u5458\u7684\u57FA\u672C\u4FEE\u517B\\Java\\\u5C1A\u7845\u8C37Java\u57FA\u7840");
        printSubFile(path);
    }

    public void printSubFile(File path)
    {
        File files[] = path.listFiles();
        File afile[] = files;
        int i = afile.length;
        for(int j = 0; j < i; j++)
        {
            File file = afile[j];
            if(file.isDirectory())
                printSubFile(file);
            else
                System.out.println(file.getPath());
        }

    }
}
