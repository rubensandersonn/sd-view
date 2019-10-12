package com.example.rubens.myapplication;

import java.io.*;
import java.net.*;
//import java.util.*;

public class Listener implements  Runnable {
    private static InetAddress host;
    private static int PORT;
    private static Socket TCPSocket;

    public Listener(InetAddress ipServer, int port) {
        this.host = ipServer;
        this.PORT = port;
    }

    @Override
    public void run(){
        try {
            TCPSocket = new Socket(host, PORT);

            //Scanner userEntry = new Scanner(System.in);
            //String message;

            ObjectOutputStream msgOutput = new ObjectOutputStream(TCPSocket.getOutputStream());
            ObjectInputStream msgInput = new ObjectInputStream(TCPSocket.getInputStream());

            while(true){
                String msgFromServer = (String) msgInput.readObject();
                System.out.println(msgFromServer);

            }


        } catch (Exception ioEx) {
            ioEx.printStackTrace();
        }

        finally {
            System.out.println("\n closing connection.... ");
            try {
                TCPSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

