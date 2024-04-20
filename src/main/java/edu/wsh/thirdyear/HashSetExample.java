package edu.wsh.thirdyear;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Grzesiek");
        names.add("ANDRZEJ");
        names.add("franciszek");

        System.out.println("Imiona zaczynające się od dużej litery:");
        names.forEach(name -> {
            if (Character.isUpperCase(name.charAt(0))) {
                System.out.println(name);
            }
        });

        System.out.println("\nImiona złożone z samych dużych liter:");
        names.forEach(name -> {
            if (name.equals(name.toUpperCase())) {
                System.out.println(name);
            }
        });

        System.out.println("\nImiona złożone z samych małych liter:");
        names.forEach(name -> {
            if (name.equals(name.toLowerCase())) {
                System.out.println(name);
            }
        });
    }
}
