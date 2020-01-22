package edu.buet.cse.ch02;

import java.util.Objects;

import edu.buet.cse.ch02.model.Person;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial7 {
  public static void main(String... args) {
    String message1 = "There is no compulsion in religion";
    String message2 = "There is no compulsion in religion";
    System.out.println(Objects.equals(message1, message2));

    Person person1 = null;
    Person person2 = null;
    Person person3 = new Person("Anon", 25);

    System.out.println(Objects.equals(person1, person2));
    System.out.println(Objects.equals(person1, person3));
  }
}
