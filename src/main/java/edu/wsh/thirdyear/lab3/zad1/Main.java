package edu.wsh.thirdyear.lab3.zad1;

public class Main {
    static int pole = 0;

    public static void main(String[] args) {
        Thread watek1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                pole++;
            }
        });

        Thread watek2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                pole++;
            }
        });

        watek1.start();
        watek2.start();

        try {
            watek1.join();
            watek2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ostateczna wartość pola: " + pole);
    }
}
