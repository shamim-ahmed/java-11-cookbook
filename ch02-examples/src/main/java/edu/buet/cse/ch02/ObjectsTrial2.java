package edu.buet.cse.ch02;

import java.util.Objects;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial2 {
  public static void main(String... args) {
    Person person = new Person("Homer", 50);
    System.out.println(Objects.toString(person));

    person = null;
    System.out.println(Objects.toString(person, "Unknown person"));
  }

  private static class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return String.format("%s is %d years old", name, age);
    }
  }
}
