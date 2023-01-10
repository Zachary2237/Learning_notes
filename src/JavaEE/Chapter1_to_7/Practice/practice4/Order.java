// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Order.java

package Chapter1_to_7.Practice.practice4;


public class Order
{

    public Order(int orderId, String orderName)
    {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderName()
    {
        return orderName;
    }

    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj instanceof Order)
        {
            Order order = (Order)obj;
            return orderId == order.orderId && orderName.equals(order.orderName);
        } else
        {
            return false;
        }
    }

    private int orderId;
    private String orderName;
}
