package edu.wsh.thirdyear.lab5.zad4;
public class Counter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.decrement();
        counter.setCount(10);
        System.out.println("Aktualna wartość licznika: " + counter.getCount());
    }

    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        count = value;
    }

}
