// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MyAnnotation.java

package Chapter15.Part2.test;

import java.lang.annotation.Annotation;

public interface MyAnnotation
    extends Annotation
{

    public abstract String[] value();
}
