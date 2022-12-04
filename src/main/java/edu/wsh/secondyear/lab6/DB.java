package edu.wsh.secondyear.lab6;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DB {
    private int realSize;
    private int lastElement;
    private int tabSize;
    Person[] personTable;

    public DB(int size) {
        System.out.println("Constructor db, size: " + size);
        tabSize = size;
        personTable = new Person[size];
        realSize = lastElement = 0;

    }


    @SneakyThrows
    void add() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var name = reader.readLine();
        var surname = reader.readLine();
        var code = Integer.parseInt(reader.readLine());
        var person = new Person(name, surname, code);
        personTable[realSize] = person;
        realSize++;

    }

    void find(int code) {
        Arrays.stream(personTable)
                .filter(p -> p.getCode() == code)
                .findFirst()
                .ifPresent(System.out::println);
    }

    void list() {
        for (Person person : personTable) {
            if (person != null) {
                System.out.println(person + " ");
            }
        }
    }

    void delete(int code) {
        int index = getIndexByCode(code);
        if (index < 0) {
            return;
        }

        if (index == realSize - 1) {
            personTable[index] = null;
            realSize--;
        }
        System.arraycopy(personTable, index + 1, personTable, index, realSize - index - 1);
        realSize--;
        for (int i = realSize; i < personTable.length; i++) {
            personTable[i] = null;

        }
        printArray(personTable);
    }

    void printArray(Person[] arr) {
        System.out.println(Arrays.asList(arr));
    }

    private int getIndexByCode(int code) {
        for (int i = 0; i < personTable.length; i++) {
            if (personTable[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
}
