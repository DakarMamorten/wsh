package edu.wsh.secondyear.lab12;

import java.io.FileInputStream;

public class DispatcherFile {
    public static void main(String args[]) {
        try {
            FileInputStream input = new FileInputStream("/home/vlad:input.txt");
            System.out.println("Data in the file: ");
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
