// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ComparableCircle.java

package Chapter1_to_7.Practice.practice10;


// Referenced classes of package Chapter1_to_7.Practice.practice10:
//            Circle, CompareObject

public class ComparableCircle extends Circle
    implements CompareObject
{

    public ComparableCircle(double radius)
    {
        super(radius);
    }

    public int compareTo(Object o)
    {
        if(this == o)
            return 0;
        if(o instanceof ComparableCircle)
        {
            ComparableCircle c = (ComparableCircle)o;
            if(getRadius() > c.getRadius())
                return 1;
            return getRadius() >= c.getRadius() ? 0 : -1;
        } else
        {
            throw new RuntimeException("\u4F20\u5165\u7684\u6570\u636E\u7C7B\u578B\u4E0D\u5339\u914D");
        }
    }
}
