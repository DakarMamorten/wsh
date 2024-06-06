package edu.wsh.thirdyear.lab4.zad1;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Wątek uruchomiony: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();
    }
}
