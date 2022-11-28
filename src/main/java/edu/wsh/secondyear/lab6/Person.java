package edu.wsh.secondyear.lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private String surname;
    private String code;

    public Person(String name, String surname, String code) {
        this.name = name;
        this.surname = surname;
        this.code = code;
    }

    public Person() {
    }

    public void print() {
        System.out.println(
                "name: " + this.name);
        System.out.println(
                "surname: " + this.surname);
        System.out.println(
                "code: " + this.code);
    }

    public Person set() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter name: ");
            name = br.readLine();
            System.out.println("Enter surname: ");
            surname = br.readLine();
            System.out.println("Enter code: ");
            code = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new Person(name, surname, code);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }
}
