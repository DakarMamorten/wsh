package edu.wsh.thirdyear.lab6.zad2;

import java.net.InetAddress;
import java.net.UnknownHostException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj nazwę domeny: ");
        try {
            String domainName = reader.readLine();
            InetAddress address = InetAddress.getByName(domainName);
            System.out.println("Adres IP dla " + domainName + " to " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Nie można znaleźć adresu IP dla podanej domeny.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu danych.");
            e.printStackTrace();
        }
    }
}
