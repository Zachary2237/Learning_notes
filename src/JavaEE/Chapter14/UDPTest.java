// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UDPTest.java

package Chapter14;

import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPTest
{

    public UDPTest()
    {
    }

    public void sender()
        throws IOException
    {
        DatagramSocket socket = new DatagramSocket();
        String str = "I'm UDP!";
        byte data[] = str.getBytes(StandardCharsets.UTF_8);
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
        socket.send(packet);
        socket.close();
    }

    public void receiver()
        throws IOException
    {
        DatagramSocket socket = new DatagramSocket(9090);
        byte buffer[] = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength()));
    }
}
