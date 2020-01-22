package edu.buet.cse.ch02;

import java.util.Objects;

import edu.buet.cse.ch02.model.Person;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial4 {
  public static void main(String... args) {
    Person person = new Person("Abrar", 36);
    printInfo(person);
    printInfo(null);
    printInfoWithDefault(null);
    printInfoWithDefaultSupplier(null);
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

  // use a default object when null is passed
  private static void printInfoWithDefault(Person person) {
    Person defaultPerson = new Person("Anon", 25);
    Person result = Objects.requireNonNullElse(person, defaultPerson);
    System.out.println(result);
  }

  // use a supplier to get the default object
  private static void printInfoWithDefaultSupplier(Person person) {
    Person defaultPerson = new Person("Anon", 25);
    Person result = Objects.requireNonNullElseGet(person, () -> defaultPerson);
    System.out.println(result);
  }
}
