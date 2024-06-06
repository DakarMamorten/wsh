package edu.wsh.thirdyear.lab3.zad7;

public class Main {
    public static void main(String[] args) {
        Licznik licznik = new Licznik();

        try {
            licznik.zmienWartosc(-5);
            System.out.println("Nowa wartość licznika: " + licznik.pobierzWartosc());
        } catch (IllegalStateException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        licznik.zmienWartosc(10);
        System.out.println("Nowa wartość licznika: " + licznik.pobierzWartosc());
    }
}
