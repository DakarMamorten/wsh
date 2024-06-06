package edu.wsh.thirdyear.lab6.zad3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        int port = 80;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serwer oczekuje na połączenie na porcie " + port);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Połączono z " + clientSocket.getRemoteSocketAddress());
            System.out.println("Lokalny adres: " + clientSocket.getLocalSocketAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

