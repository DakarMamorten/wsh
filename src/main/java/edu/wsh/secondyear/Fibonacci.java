package edu.wsh.secondyear;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int count;
        int num1 = 0;
        int num2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe wyrazow ciagu: ");
        count = scan.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}

