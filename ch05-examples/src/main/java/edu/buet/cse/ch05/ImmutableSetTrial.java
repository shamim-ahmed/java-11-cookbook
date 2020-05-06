package edu.buet.cse.ch05;

import java.util.Set;

/**
 * Use the static factory method Set.of() to create an immutable Set
 * 
 * @author shamim
 */
public class ImmutableSetTrial {
  public static void main(String... args) {
    // all arguments must be non null
    Set<String> wordSet = Set.of("This", "is", "a", "test");

    wordSet.forEach(System.out::println);
  }
}
