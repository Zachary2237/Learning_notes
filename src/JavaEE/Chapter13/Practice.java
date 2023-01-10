// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Practice.java

package Chapter13;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Practice
{

    public Practice()
    {
    }

    public void secret()
    {
        BufferedInputStream bis;
        BufferedOutputStream bos;
        bis = null;
        bos = null;
        bis = new BufferedInputStream(new FileInputStream(new File("\u52A0\u5BC6.png")));
        bos = new BufferedOutputStream(new FileOutputStream(new File("\u89E3\u5BC6.png")));
        byte buf[] = new byte[10];
        int len;
        while((len = bis.read(buf)) != -1) 
        {
            for(int i = 0; i < len; i++)
                buf[i] = (byte)(buf[i] ^ 5);

            bos.write(buf, 0, len);
        }
        IOException e;
        try
        {
            bos.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            bis.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_199;
        e;
        e.printStackTrace();
        try
        {
            bos.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            bis.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_199;
        Exception exception;
        exception;
        try
        {
            bos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            bis.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public void numsOfChars()
    {
        BufferedReader br;
        BufferedWriter bw;
        br = null;
        bw = null;
        br = new BufferedReader(new FileReader(new File("Hello.txt")));
        bw = new BufferedWriter(new FileWriter(new File("index.txt")));
        char buf[] = new char[1];
        int len;
        Map map;
        for(map = new HashMap(); (len = br.read(buf)) != -1; map = count(buf[0], map));
        bw.write(map.toString());
        IOException e;
        try
        {
            bw.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_192;
        e;
        e.printStackTrace();
        try
        {
            bw.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_192;
        Exception exception;
        exception;
        try
        {
            bw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public Map count(char c, Map map)
    {
        if(map.containsKey(Character.valueOf(c)))
            map.replace(Character.valueOf(c), Integer.valueOf(((Integer)map.get(Character.valueOf(c))).intValue() + 1));
        else
            map.put(Character.valueOf(c), Integer.valueOf(1));
        return map;
    }
}
