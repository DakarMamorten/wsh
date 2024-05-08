package edu.wsh.thirdyear.lab2.zad2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nazwaPliku = "tekst.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            System.out.println("Wpisuj tekst (wpisz 'quit' aby zakończyć):");

            String linia;
            while (!(linia = scanner.nextLine()).equals("quit")) {
                writer.println(linia);
            }

            System.out.println("Zakończono zapis do pliku.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
