package com.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8005)
                ) {
            // System.out.println(socket.getLocalPort());
            // System.out.println(socket.getLocalAddress());

            socket.setSoTimeout(5000);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the zone id: ");
            String zoneId = scanner.nextLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println(zoneId);
            out.flush();


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String date = bufferedReader.readLine();
            System.out.println(date);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
