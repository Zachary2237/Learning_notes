// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Status.java

package TeamScheduleProject.service;


public final class Status extends Enum
{

    public static Status[] values()
    {
        return (Status[])$VALUES.clone();
    }

    public static Status valueOf(String name)
    {
        return (Status)Enum.valueOf(TeamScheduleProject/service/Status, name);
    }

    private Status(String s, int i)
    {
        super(s, i);
    }

    private static Status[] $values()
    {
        return (new Status[] {
            FREE, BUSY, VOCATION
        });
    }

    public static final Status FREE = new Status("FREE", 0);
    public static final Status BUSY = new Status("BUSY", 1);
    public static final Status VOCATION = new Status("VOCATION", 2);
    private static final Status $VALUES[] = $values();

}
