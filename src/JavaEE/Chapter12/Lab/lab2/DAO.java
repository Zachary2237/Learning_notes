// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DAO.java

package Chapter12.Lab.lab2;

import java.util.*;

public class DAO
{

    public DAO()
    {
        map = new HashMap();
    }

    public void save(String id, Object entity)
    {
        map.put(id, entity);
    }

    public Object get(String id)
    {
        return map.get(id);
    }

    public void update(String id, Object entity)
    {
        map.replace(id, entity);
    }

    public List list()
    {
        Collection values = map.values();
        Iterator iterator = values.iterator();
        List list = new ArrayList();
        Object next;
        for(; iterator.hasNext(); list.add(next))
            next = iterator.next();

        return list;
    }

    public void delete(String id)
    {
        map.remove(id);
    }

    private Map map;
}
