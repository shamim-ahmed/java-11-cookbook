package edu.buet.cse.ch05;

import java.util.Set;

/**
 * Use the static factory method Set.of() to create an immutable Set
 * 
 * @author shamim
 */
public class ImmutableSetTrial {
  public static void main(String... args) {
    Set<String> wordSet = Set.of("This", "is", "a", "test");
    wordSet.forEach(System.out::println);
    System.out.println();

    // the set is immutable
    try {
      wordSet.add("world");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }

    // all arguments must be non null
    try {
      Set.of("Hello", "world", null);
    } catch (NullPointerException ex) {
      System.err.println(ex);
    }
  }
}
