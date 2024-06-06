package edu.wsh.thirdyear.lab5.zad2;

public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        System.out.println("Aktualna wartość licznika: " + counter.getCount());
    }
}
