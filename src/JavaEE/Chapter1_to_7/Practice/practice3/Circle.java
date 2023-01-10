// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Circle.java

package Chapter1_to_7.Practice.practice3;


// Referenced classes of package Chapter1_to_7.Practice.practice3:
//            GeometricObject

public class Circle extends GeometricObject
{

    public Circle(String color, double weight, double radius)
    {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double findArea()
    {
        return 3.1400000000000001D * radius * radius;
    }

    private double radius;
}
