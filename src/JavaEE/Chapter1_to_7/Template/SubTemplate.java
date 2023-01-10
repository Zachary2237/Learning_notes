// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TemplateTest.java

package Chapter1_to_7.Template;

import java.io.PrintStream;

// Referenced classes of package Chapter1_to_7.Template:
//            Template

class SubTemplate extends Template
{

    SubTemplate()
    {
    }

    public void code()
    {
        for(int i = 2; i <= 1000; i++)
        {
            boolean isFlag = true;
            int j = 2;
            do
            {
                if((double)j > Math.sqrt(i))
                    break;
                if(i % j == 0)
                {
                    isFlag = false;
                    break;
                }
                j++;
            } while(true);
            if(isFlag)
                System.out.println(i);
        }

    }
}
