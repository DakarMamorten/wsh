package edu.wsh.lab5;

public class Main {
    public static void main(String[] args) {
        int[] tabInt = {2, 40, 500};
        double[] tabDouble = {3.14, 5.4, 6.6, 12.3};
        Write write = new Write();
        write.wypisz(10);
        write.wypisz(7, 128);
        write.wypisz(3.14);
        write.wypisz("Witaj!");
        write.wypisz(tabInt);
        write.wypisz(tabDouble);

        double[] myList = {4.9, 1.9, 3.4, 3.2};
        TestArray17 tab = new TestArray17(myList);
        double result;
        System.out.println("Array demo");
        tab.printArray();
        result = tab.sumAll();
        System.out.println("Total is " + result);
        result = tab.findMax();
        System.out.println("Max is " + result);

        double[] myListDouble = {1.9, 2.9, 3.4, 3.5};
        int[] myListInt = {1,2,3,4,5};
        ArrayTest arr = new ArrayTest();
        System.out.println();
        System.out.println("Array demo");
        arr.printArray(myListDouble);
        System.out.println();
        System.out.println("Total is " + arr.sumAll(myListDouble));
        System.out.println("Max is " + arr.findMax(myListDouble));
        System.out.println("Total is " + arr.sumAll(myListInt));
        System.out.println("Max is " + arr.findMax(myListInt));
    }
}
