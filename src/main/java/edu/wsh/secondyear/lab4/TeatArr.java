package edu.wsh.secondyear.lab4;

import java.util.Arrays;

public class TeatArr {

    public static void main(String[] args) {
        double byteArr []  = {4.9, 1.9, 3.4, 3.2};
        printArray(byteArr);
        System.out.println("_______________________________");
        Arrays.sort(byteArr);
        printArray(byteArr);

        System.out.println("---------------------");
        System.out.println(Arrays.binarySearch(byteArr, 3.2));
    }

    public static void printArray(double array[]) {
        for (double v : array) {
            System.out.println(v);
        }
    }
}
