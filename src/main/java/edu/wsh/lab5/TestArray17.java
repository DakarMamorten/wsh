package edu.wsh.lab5;

public class TestArray17 {
    double[] arr;
    int size;


    TestArray17(int n) {
        arr = new double[n];
        size = n;
    }

    TestArray17(double[] tab) {
        this.arr = tab;

    }

    void printArray() {
        for (double v : arr) {
            System.out.println(v + " ");
        }
    }

    double findMax() {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    double sumAll() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
