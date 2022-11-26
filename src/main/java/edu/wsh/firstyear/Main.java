package edu.wsh.firstyear;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    Map<Person, Integer> map = new TreeMap<>();
//    map.put(new Person("Vlad", 25), 10);
//    map.put(new Person("Sergey", 40), 8);
//    map.put(new Person("Andrey", 40), 8);
//    map.put(new Person("Kirill", 40), 8);

    List<Person> list = new ArrayList<>();
    list.add(new Person("Vlad", 25));
    list.add(new Person("Sergey", 40));
    list.add(new Person("Andrey", 40));
    list.add(new Person("Kirill", 15));

    switch (2) {
      case 1:
        System.out.print(1);
      case 2:
        System.out.print(2);
      case 3:
        System.out.print(3);
      default:
        System.out.print(0);
    }
  }

}

@Data
@AllArgsConstructor
class Person implements Comparable<Person> {

  private String name;
  private Integer age;

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.getName());
  }
}

class PersonAgeComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
    return o1.getAge().compareTo(o2.getAge());
  }
}
