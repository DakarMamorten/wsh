package edu.wsh.thirdyear.lab1;

public class Tablica {
    /**
     *Zadanie 8
    */
//    boolean error = false;
//    int[] array = new int[5];
//
//    public int getElement(int index) {
//        if (index >= 0 && index < array.length) {
//            return array[index];
//        } else {
//            System.out.println("Indeks poza zakresem tablicy!");
//            error = true;
//            return -1;
//        }
//    }

     /**
     *Zadanie 9
     */
/*
    int[] array = new int[5];

    public int getElement(int index) {
        try {
            if (index >= 0 && index < array.length) {
                return array[index];
            } else {
                throw new IndexOutOfBoundsException("Indeks poza zakresem tablicy!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Błąd: " + e.getMessage());
            return -1;
        }
    }
    */


    /**
     *Zadanie 10
     */
/*
    int[] array = new int[5];

    public int getElement(int index) {
        try {

            if (index >= 0 && index < array.length) {
                return array[index];
            } else {
                throw new IndexOutOfBoundsException("Indeks poza zakresem tablicy!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }
*/
    /**
     *Zadanie 11
     */
/*
    int[] array = new int[5];

    public int getElement(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Indeks poza zakresem tablicy!");
        }
    }
*/
    /**
     *Zadanie 12
     */
    int[] array = new int[5];

    public int getElement(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Indeks poza zakresem tablicy!");
        }
    }
}
