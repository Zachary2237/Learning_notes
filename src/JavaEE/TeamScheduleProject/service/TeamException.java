// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TeamException.java

package TeamScheduleProject.service;


public class TeamException extends Exception
{

    public TeamException(String message)
    {
        super(message);
        this.message = message;
    }

    private String message;
}
