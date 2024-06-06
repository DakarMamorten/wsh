package edu.wsh.thirdyear.lab3.zad5;

import java.util.concurrent.locks.ReentrantLock;

public class Licznik {
    private int wartosc = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void zmienWartosc(int wartosc) {
        lock.lock();
        try {
            this.wartosc += wartosc;
            if (this.wartosc < 0) {
                throw new IllegalStateException("Wartość licznika nie może być ujemna.");
            }
        } finally {
            lock.unlock();
        }
    }

    public int pobierzWartosc() {
        lock.lock();
        try {
            return wartosc;
        } finally {
            lock.unlock();
        }
    }
}
