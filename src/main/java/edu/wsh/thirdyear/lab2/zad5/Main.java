package edu.wsh.thirdyear.lab2.zad5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Podaj nazwy plików źródłowych i docelowych jako parametry wywołania.");
            return;
        }

        String plikZrodlowy = args[0];
        String plikDocelowy = args[1];

        try (FileInputStream fis = new FileInputStream(plikZrodlowy);
             FileOutputStream fos = new FileOutputStream(plikDocelowy)) {

            byte[] bufor = new byte[1024];
            int iloscOdczytanychBajtow;

            while ((iloscOdczytanychBajtow = fis.read(bufor)) != -1) {
                fos.write(bufor, 0, iloscOdczytanychBajtow);
            }

            System.out.println("Plik został skopiowany pomyślnie.");
        } catch (IOException e) {
            System.err.println("Błąd podczas kopiowania pliku: " + e.getMessage());
        }
    }
}
