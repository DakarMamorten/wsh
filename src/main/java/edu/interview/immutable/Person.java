package edu.interview.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

  private final String name;
  private final List<Phone> phones;

  public Person(final String name, final List<Phone> phones) {
    this.name = name;
    this.phones = new ArrayList<>(phones);
  }

  public String getName() {
    return name;
  }

  public List<Phone> getPhones() {
    return new ArrayList<>(phones);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) && Objects.equals(phones, person.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phones);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", phones=" + phones +
        '}';
  }
}
