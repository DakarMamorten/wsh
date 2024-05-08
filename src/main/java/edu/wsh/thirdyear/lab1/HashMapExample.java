package edu.wsh.thirdyear.lab1;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Anna");
        map.put(2, "Bartek");
        map.put(3, "Karolina");
        map.put(4, "Marcin");
        map.put(5, "Katarzyna");

        System.out.println("Zawartość HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Klucz: " + key + ", Wartość: " + map.get(key));
        }
    }
}
