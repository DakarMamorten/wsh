package edu.wsh.thirdyear.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(100);
            } while (numbers.contains(randomNumber));
            numbers.add(randomNumber);
        }

        Collections.sort(numbers);
        System.out.println("Posortowana lista: ");
        displayList(numbers);

        if (numbers.size() >= 2) {
            numbers.remove(1);
            System.out.println("Lista po usunięciu drugiego elementu: ");
            displayList(numbers);
        }

        int newNumber = rand.nextInt(100);
        numbers.add(newNumber);
        System.out.println("Lista po dodaniu nowego elementu: ");
        displayList(numbers);

        Collections.sort(numbers);
        System.out.println("Posortowana lista po dodaniu nowego elementu: ");
        displayList(numbers);
    }

    public static void displayList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
