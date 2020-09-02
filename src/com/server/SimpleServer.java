package com.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleServer {
    public static void main(String[] args) {
        try( ServerSocket serverSocket = new ServerSocket(8005) ) {

            ExecutorService executorService = Executors.newFixedThreadPool(10);

            while(true) {
                System.out.println("Waiting for client connection....");
                Socket socket = serverSocket.accept();
                System.out.println("Client connection accepted from " + socket.getRemoteSocketAddress());
                // System.out.println(socket.getRemoteSocketAddress());
                // System.out.println(socket.getPort());

                executorService.submit(new SimpleClientRunnable(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
