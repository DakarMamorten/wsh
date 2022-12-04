package edu.wsh.secondyear.lab7;

import java.util.Scanner;
public class TestBD {
    public static void main(String[] args) {
        int selection;
        int code;
        final int maxTab = 4;
        DB myBaza = new DB(maxTab);
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1 add, 2 list, 3 find, 4 delete, 5 end");
            selection = scan.nextInt();
            System.out.println("selection = " + selection);
            switch (selection) {
                case 1:
                    System.out.println("add");
                    myBaza.add();
                    break;
                case 2:
                    System.out.println("list");
                    myBaza.list();
                    break;
                case 3:
                    System.out.println("find");
                    System.out.println("Let code: ");
                    code = scan.nextInt();
                    myBaza.find(code);
                    break;
                case 4:
                    System.out.println("delete");
                    code = scan.nextInt();
                    myBaza.delete(code);
                    break;
                default: System.out.println("End");
            }
        } while (selection != 5);
        System.out.println("End");
    }
}
