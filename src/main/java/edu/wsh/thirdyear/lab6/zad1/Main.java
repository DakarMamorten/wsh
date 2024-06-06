package edu.wsh.thirdyear.lab6.zad1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String host = "google.com";
        int port = 80;

        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 2000);
            System.out.println("Połączono z " + socket.getRemoteSocketAddress());
            System.out.println("Lokalny adres: " + socket.getLocalSocketAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
