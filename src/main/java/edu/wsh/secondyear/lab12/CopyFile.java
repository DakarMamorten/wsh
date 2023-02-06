package edu.wsh.secondyear.lab12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        try (FileInputStream in = new FileInputStream("/home/vlad/input.txt");
             FileOutputStream out = new FileOutputStream("/home/vlad/output.txt")) {
            int copy;
            while ((copy = in.read()) != -1) {
                out.write(copy);
                System.out.print((char) copy);
            }
        }
    }
}
