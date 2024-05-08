package edu.wsh.thirdyear.lab1;

import java.util.HashSet;

public class HashSetExampleName {
    public static void main(String[] args) {
        HashSet<String> kolekcja1 = new HashSet<>();

        kolekcja1.add("Anna");
        kolekcja1.add("Bartek");
        kolekcja1.add("Karolina");
        kolekcja1.add("Marcin");
        kolekcja1.add("Katarzyna");
        kolekcja1.add("Piotr");
        kolekcja1.add("Magdalena");

        System.out.println("Zawartość kolekcji1 po dodaniu imion:");
        for (String name : kolekcja1) {
            System.out.println(name);
        }

        kolekcja1.remove("Anna");
        System.out.println("\nZawartość kolekcji1 po usunięciu jednego imienia:");
        for (String name : kolekcja1) {
            System.out.println(name);
        }

        HashSet<String> kolekcja2 = new HashSet<>();
        kolekcja2.add("Kamil");
        kolekcja2.add("Dominika");
        kolekcja2.add("Oskar");
        kolekcja2.add("Julia");
        kolekcja2.add("Michał");

        String szukaneImie = "Julia";
        if (kolekcja2.contains(szukaneImie)) {
            System.out.println("\nKolekcja2 zawiera imię: " + szukaneImie);
        } else {
            System.out.println("\nKolekcja2 nie zawiera imienia: " + szukaneImie);
        }

        kolekcja1.addAll(kolekcja2);
        System.out.println("\nZawartość kolekcji1 po dodaniu kolekcji2:");
        for (String name : kolekcja1) {
            System.out.println(name);
        }
    }
}
