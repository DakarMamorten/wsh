package edu.wsh.thirdyear.lab4.zad5;

import java.util.Random;

public class MultiThreadExample implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        String[] messages = {"Wiadomość 1", "Wiadomość 2", "Wiadomość 3", "Wiadomość 4"};

        while (true) {
            int index = random.nextInt(messages.length);
            System.out.println(Thread.currentThread().getName() + ": " + messages[index]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiThreadExample(), "Thread-1");
        Thread thread2 = new Thread(new MultiThreadExample(), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
