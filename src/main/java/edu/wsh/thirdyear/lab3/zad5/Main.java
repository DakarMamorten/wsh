package edu.wsh.thirdyear.lab3.zad5;

public class Main {
    public static void main(String[] args) {
        Licznik licznik = new Licznik();

        Thread watek1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                licznik.zmienWartosc(1);
            }
        });

        Thread watek2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                licznik.zmienWartosc(-1);
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

        System.out.println("Ostateczna wartość licznika: " + licznik.pobierzWartosc());
    }
}
