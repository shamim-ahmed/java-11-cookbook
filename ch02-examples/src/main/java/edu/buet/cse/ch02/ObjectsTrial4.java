package edu.buet.cse.ch02;

import java.util.Objects;

import edu.buet.cse.ch02.model.Person;

public class ObjectsTrial4 {
  public static void main(String... args) {
    Person person = new Person("Abrar", 36);
    printInfo(person);
    printInfo(null);
    printInfoWithCheck(null);
  }

  private static void printInfo(Person person) {
    try {
      Objects.requireNonNull(person);
    } catch (NullPointerException ex) {
      System.out.println(ex);
      return;
    }

    System.out.println(person);
  }

  private static void printInfoWithCheck(Person person) {
    Person defaultPerson = new Person("Anon", 25);
    Person result = Objects.requireNonNullElse(person, defaultPerson);
    System.out.println(result);
  }
}
