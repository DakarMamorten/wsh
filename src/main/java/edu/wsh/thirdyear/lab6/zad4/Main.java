package edu.wsh.thirdyear.lab6.zad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Podaj adres IP: ");
            String host = reader.readLine();

            System.out.print("Podaj port: ");
            int port = Integer.parseInt(reader.readLine());

            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 2000);
            System.out.println("Połączono z " + socket.getRemoteSocketAddress());
            System.out.println("Lokalny adres: " + socket.getLocalSocketAddress());
            socket.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas nawiązywania połączenia.");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

