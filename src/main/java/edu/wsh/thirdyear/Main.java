package edu.wsh.thirdyear;

public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica();

        int index = 7;
        try {
            int element = tablica.getElement(index);
            System.out.println("Element na indeksie " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        index = 2;
        try {
            int element = tablica.getElement(index);
            System.out.println("Element na indeksie " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}

