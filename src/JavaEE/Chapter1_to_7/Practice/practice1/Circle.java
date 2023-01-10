// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CylinderTest.java

package Chapter1_to_7.Practice.practice1;


class Circle
{

    public Circle()
    {
        radius = 1.0D;
    }

    void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    double findArea()
    {
        double a = 3.1400000000000001D * radius * radius;
        return a;
    }

    private double radius;
}
