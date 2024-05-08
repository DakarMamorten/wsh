package edu.wsh.thirdyear.lab2.zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nazwaPliku = "tekst.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            System.out.println("Zawartość pliku " + nazwaPliku + ":");

            String linia;
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.err.println("Błąd podczas wczytywania pliku: " + e.getMessage());
        }
    }
}
