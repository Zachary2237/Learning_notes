// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CylinderTest.java

package Chapter1_to_7.Practice.practice1;


// Referenced classes of package Chapter1_to_7.Practice.practice1:
//            Circle

class Cylinder extends Circle
{

    public Cylinder()
    {
        length = 1.0D;
    }

    void setLength(double length)
    {
        this.length = length;
    }

    double getLength()
    {
        return length;
    }

    double findVolume()
    {
        double v = findArea() * length;
        return v;
    }

    private double length;
}
