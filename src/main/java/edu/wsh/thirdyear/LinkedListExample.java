package edu.wsh.thirdyear;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Character> alphabet = new LinkedList<>();

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(letter);
        }

        System.out.println("Litery od Z do A:");
        Collections.reverse(alphabet);
        for (char letter : alphabet) {
            System.out.print(letter + " ");
        }
    }
}
