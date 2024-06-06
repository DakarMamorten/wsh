package edu.wsh.thirdyear.lab3.zad4;

public class Licznik {
    private int wartosc = 0;

    public synchronized void zwieksz() {
        wartosc++;
    }

    public synchronized int pobierzWartosc() {
        return wartosc;
    }
}
