package edu.wsh.thirdyear.lab5.zad5;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.changeCount(5);
        counter.changeCount(-3);
        System.out.println("Aktualna wartość licznika: " + counter.getCount());
    }

    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void changeCount(int value) {
        lock.lock();
        try {
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
}

