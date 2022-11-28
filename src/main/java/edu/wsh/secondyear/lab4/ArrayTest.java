package edu.wsh.secondyear.lab4;

public class ArrayTest {

    public static void main(String[] args) {
        double[] arr = {4.9, 1.9, 3.4, 3.2};
        System.out.println(findMax(arr));
        System.out.println("---------------------");
        printArray(arr);
        System.out.println("---------------------");
        System.out.println(sumAll(arr));
        sortArray(arr);
        System.out.println("---------------------");
        printArray(arr);
        System.out.println("---------------------");
        odwroc(arr);
        printArray(arr);
        System.out.println("---------------------");
        System.out.println(szukaj(arr, 1.9));
        System.out.println("---------------------");

    }

    public static double findMax(double array[]) {
        double max = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printArray(double array[]) {
        for (double v : array) {
            System.out.println(v);
        }
    }

    public static double sumAll(double array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void sortArray(double arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }

    public static void odwroc(double array[]) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            double tmp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = tmp;
        }
    }

    public static int szukaj(double tab[], double key) {
        for (int index = 0; index < tab.length; index++) {
            if (tab[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
