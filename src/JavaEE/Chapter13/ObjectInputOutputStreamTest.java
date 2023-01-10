// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ObjectInputOutputStreamTest.java

package Chapter13;

import java.io.*;

// Referenced classes of package Chapter13:
//            Person

public class ObjectInputOutputStreamTest
{

    public ObjectInputOutputStreamTest()
    {
    }

    public void testObjectOutputStream()
    {
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(new FileOutputStream("Object.dat"));
        oos.writeObject(new String("I love Java"));
        oos.flush();
        oos.writeObject(new Person("Tom", 18));
        oos.flush();
        IOException e;
        try
        {
            oos.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_107;
        e;
        e.printStackTrace();
        try
        {
            oos.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_107;
        Exception exception;
        exception;
        try
        {
            oos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }

    public void testObjectInputStream()
    {
        ObjectInputStream ois = null;
        ois = new ObjectInputStream(new FileInputStream("Object.dat"));
        Object obj = ois.readObject();
        String str = (String)obj;
        Person p = (Person)ois.readObject();
        System.out.println(str);
        System.out.println(p);
        IOException e;
        try
        {
            ois.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_127;
        e;
        e.printStackTrace();
        try
        {
            ois.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_127;
        e;
        e.printStackTrace();
        try
        {
            ois.close();
        }
        // Misplaced declaration of an exception variable
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_127;
        Exception exception;
        exception;
        try
        {
            ois.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
    }
}
