package edu.interview.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

  public static void main(String[] args) {

    Phone phone = new Phone("123456789");
    Phone phone1 = new Phone("789129478");
    Phone phone2 = new Phone("665458752");

    List<Phone> phoneList = new ArrayList<>();
    phoneList.add(phone);
    phoneList.add(phone1);

    Person vlad = new Person("Vlad", phoneList);

    System.out.println(vlad);

    vlad.getPhones().add(phone2);

    System.out.println(vlad);



  }

}
