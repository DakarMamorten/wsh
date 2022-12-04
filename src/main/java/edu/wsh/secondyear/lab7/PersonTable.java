package edu.wsh.secondyear.lab7;

public class PersonTable {
    public static void main(String[] args) {

        final int maxTab = 3;
        Person[] personTab = new Person[3];

        int i;
        for (i = 0; i < maxTab; i++) {
            Person set = new Person().set();
            personTab[0] = set;
            personTab[1] = set;
            personTab[2] = set;
            System.out.println(personTab[1].getName() + " " + personTab[1].getSurname() + " " + personTab[1].getCode());
        }
    }

}
