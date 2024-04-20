package edu.wsh.thirdyear;

public class ArrayUser {
    public static void main(String[] args) {

        /**
         * Zadanie 8
         */
//        Tablica tablica = new Tablica();
//
//        int index = 7;
//        int element = tablica.getElement(index);
//        if (tablica.error) {
//            System.out.println("Wystąpił błąd!");
//        } else {
//            System.out.println("Element na indeksie " + index + ": " + element);
//        }
//
//        index = 2;
//        element = tablica.getElement(index);
//        if (tablica.error) {
//            System.out.println("Wystąpił błąd!");
//        } else {
//            System.out.println("Element na indeksie " + index + ": " + element);
//        }
/**
 * Zadanie 9
 */
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
