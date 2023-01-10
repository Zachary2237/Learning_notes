// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MyRectangle.java

package Chapter1_to_7.Practice.practice3;


// Referenced classes of package Chapter1_to_7.Practice.practice3:
//            GeometricObject

public class MyRectangle extends GeometricObject
{

    public MyRectangle(String color, double weight, double width, double height)
    {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double findArea()
    {
        return width * height;
    }

    private double width;
    private double height;
}
