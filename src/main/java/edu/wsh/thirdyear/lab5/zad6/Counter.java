package edu.wsh.thirdyear.lab5.zad6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.changeCount(10);
        counter.changeCount(-5);
        counter.changeCount(-10); // Operacja odrzucona
        System.out.println("Ostateczna wartość licznika: " + counter.getCount());
    }
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void changeCount(int value) {
        lock.lock();
        try {
            if (count + value >= 0) {
                count += value;
            } else {
                System.out.println("Operacja odrzucona: wynik byłby ujemny.");
            }
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }

}
