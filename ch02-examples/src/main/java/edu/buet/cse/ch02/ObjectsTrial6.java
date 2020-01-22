package edu.buet.cse.ch02;

import java.util.Objects;

import edu.buet.cse.ch02.model.Person;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial6 {
  public static void main(String... args) {
    Person person1 = new Person("Hakon", 36);
    int hash1 = Objects.hash(person1.getName(), person1.getAge(), null);
    System.out.println(hash1);

    Person person2 = new Person("Hakon", 36);
    int hash2 = Objects.hash(person2.getName(), person2.getAge(), null);
    System.out.println(hash2);
    System.out.println(hash1 == hash2);
  }
}
