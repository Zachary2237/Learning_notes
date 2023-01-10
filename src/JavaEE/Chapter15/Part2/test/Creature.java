// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Creature.java

package Chapter15.Part2.test;

import java.io.PrintStream;
import java.io.Serializable;

public class Creature
    implements Serializable
{

    public Creature()
    {
    }

    private void breath()
    {
        System.out.println("Breath!");
    }

    public void eat()
    {
        System.out.println("Eat!");
    }

    private char gender;
    public double weight;
}
