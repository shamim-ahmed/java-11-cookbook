package edu.buet.cse.ch02;

import java.util.Objects;

import edu.buet.cse.ch02.model.Person;

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
}
