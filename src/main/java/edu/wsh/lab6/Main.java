package edu.wsh.lab6;

public class Main {
    public static void main(String[] args) {
        String code;
        String surname;
        String name;
        Person person1 = new Person();
        Person person2 = new Person("Jan", "Braun", "123534124");
        person2.print();
        person1.print();
        person1.set();
        person1.print();
        name = person1.getName();
        surname = person1.getSurname();
        code = person1.getCode();
        System.out.println(name + " " + surname + " " + code);
        name = person2.getName();
        surname = person2.getSurname();
        code = person2.getCode();
        person2.print();
        System.out.println(name + " " + surname + " " + code);
    }
}
