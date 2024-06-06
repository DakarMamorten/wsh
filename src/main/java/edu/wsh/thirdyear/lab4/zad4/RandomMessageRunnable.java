package edu.wsh.thirdyear.lab4.zad4;
import java.util.Random;

public class RandomMessageRunnable implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        String[] messages = {"Wiadomość 1", "Wiadomość 2", "Wiadomość 3", "Wiadomość 4"};

        while (true) {
            int index = random.nextInt(messages.length);
            System.out.println(messages[index]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RandomMessageRunnable());
        thread.start();
    }
}

