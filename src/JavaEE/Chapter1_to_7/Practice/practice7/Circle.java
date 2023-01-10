// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CircleTest.java

package Chapter1_to_7.Practice.practice7;


class Circle
{

    public Circle()
    {
        id = init++;
        total++;
    }

    public double findArea()
    {
        return 3.1400000000000001D * radius * radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public static int getTotal()
    {
        return total;
    }

    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;

}
