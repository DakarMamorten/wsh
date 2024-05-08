package edu.wsh.thirdyear.lab1;


public class ArrayHolder {
    int[] array = new int[5];

    public int getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Indeks poza zakresem tablicy!");
        }
    }
}
