// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GeometricObject.java

package Chapter1_to_7.Practice.practice5;


public class GeometricObject
{

    public GeometricObject()
    {
        color = "white";
        weight = 1.0D;
    }

    public GeometricObject(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    protected String color;
    protected double weight;
}
