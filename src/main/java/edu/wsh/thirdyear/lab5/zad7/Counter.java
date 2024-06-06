package edu.wsh.thirdyear.lab5.zad7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void changeCount(int value) {
        lock.lock();
        try {
            if (count + value < 0) {
                throw new IllegalArgumentException("Wartość licznika nie może być ujemna.");
            }
            count += value;
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

    public static void main(String[] args) {
        Counter counter = new Counter();

        try {
            counter.changeCount(10);
            counter.changeCount(-5);
            counter.changeCount(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ostateczna wartość licznika: " + counter.getCount());
    }
}
