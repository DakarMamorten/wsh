package edu.wsh.thirdyear.lab4.zad7;

import java.util.Random;

public class RandomInterruptRunnable implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        String[] messages = {"Wiadomość 1", "Wiadomość 2", "Wiadomość 3", "Wiadomość 4"};

        try {
            while (!Thread.currentThread().isInterrupted()) {
                int index = random.nextInt(messages.length);
                System.out.println(Thread.currentThread().getName() + ": " + messages[index]);
                Thread.sleep(random.nextInt(2000));
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ": Wątek został przerwany.");
        }
        System.out.println(Thread.currentThread().getName() + ": Wątek zakończył działanie.");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RandomInterruptRunnable(), "Thread-1");
        Thread thread2 = new Thread(new RandomInterruptRunnable(), "Thread-2");

        thread1.start();
        thread2.start();

        Random random = new Random();
        Thread.sleep(random.nextInt(5000) + 1000);
        thread1.interrupt();

        Thread.sleep(random.nextInt(5000) + 1000);
        thread2.interrupt();
    }
}
