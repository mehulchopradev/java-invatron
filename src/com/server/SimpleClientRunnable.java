package com.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;

public class SimpleClientRunnable implements Callable<Void> {

    private Socket socket;

    public SimpleClientRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Void call() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        String zoneId = br.readLine();

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm");
        String response = zonedDateTime.format(dateTimeFormatter);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            out.println(response);
        }


        /* LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm");
        String response = localDateTime.format(dateTimeFormatter);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            out.println(response);
        } */

        return null;
    }
}
