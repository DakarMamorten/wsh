package edu.wsh.firstyear;

import java.io.*;
import java.util.Scanner;

public class AcademicData {

    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\students-warning.dat"))) {
            File file = readFileNameFromUser();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] student = line.split(" ");

                if (isStudentWarning(Double.parseDouble(student[2]), Integer.parseInt(student[1]))) {
                    printWriter.write(line + "\n");
                }
            }

        } catch (NumberFormatException exception) {
            System.out.println("Incorrect data in file");
        } catch (IOException exception) {
            System.out.println("Something wrong with read/write to the file");
        }
    }

    private static boolean isStudentWarning(double points, int hours) {
        double gpa = points / hours;
        if (hours < 30 && gpa < 1.5) {
            return true;
        }
        if (hours < 60 && gpa < 1.75) {
            return true;
        }
        return hours >= 60 && gpa < 2.0;

    }

    public static File readFileNameFromUser() {
        File file;
        do {
            String path = getPathToFile();
            file = new File((path));
        }

        while (!file.exists());

        return file;
    }

    private static String getPathToFile() {
        System.out.print("Input path to file: ");
        Scanner scannerPath = new Scanner(System.in);
        return scannerPath.nextLine();
    }

}
