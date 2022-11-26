package edu.wsh.firstyear;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AcademicDataStream {

    public static void main(String[] args) {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\students-warning.dat"))) {
            List<Student> studentList = Files.readAllLines(Path.of("d:\\students.dat"))
                    .stream()
                    .map(mapToStudent())
                    .filter(s -> isStudentWarning().test(s.getPoints(), s.getHours()))
                    .collect(Collectors.toList());

            studentList.forEach(l -> printWriter.write(l + "\n"));

        } catch (NumberFormatException exception) {
            System.out.println("Incorrect data in file");
        } catch (IOException exception) {
            System.out.println("Something wrong with read/write to the file");
        }
    }

    private static Function<String, Student> mapToStudent() {
        return str -> {
            String[] strings = str.split(" ");
            return new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]));
        };
    }

    private static BiPredicate<Double, Integer> isStudentWarning() {
        return (points, hours) -> {
            double gpa = points / hours;
            if (hours < 30 && gpa < 1.5) {
                return true;
            }
            if (hours < 60 && gpa < 1.75) {
                return true;
            }
            return hours >= 60 && gpa < 2.0;
        };
    }

}
