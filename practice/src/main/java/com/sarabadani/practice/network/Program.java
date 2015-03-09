package com.sarabadani.practice.network;

import org.omg.CORBA.portable.*;

import java.io.*;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;

/**
 * Created by soroosh on 12/2/14.
 */
public class Program {
    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(7070);
//        Socket socket = serverSocket.accept();
//        System.out.println(socket);


        InputStream inputStream = new FileInputStream("/home/soroosh/temp/simple.txt");
        inputStream = new BufferedInputStream(inputStream);
        String a = "This is a test";
        int readByte;
        int count = 0;
        while ((readByte = inputStream.read()) != -1) {
            count++;
            System.out.println((char) readByte);
            System.out.println(readByte);
        }
        System.out.println(count);

//        System. = printStream;
        InetAddress googleAddress = InetAddress.getByName("www.google.com");
        System.out.println(googleAddress);

        for (Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces(); networkInterfaces.hasMoreElements(); ) {
            System.out.println(networkInterfaces.nextElement());
        }


    }
}
