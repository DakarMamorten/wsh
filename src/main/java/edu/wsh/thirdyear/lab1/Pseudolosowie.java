package edu.wsh.thirdyear.lab1;

import java.util.LinkedList;
import java.util.Random;

public class Pseudolosowie {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Liczby od lewej do prawej:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nLiczby od prawej do lewej:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
