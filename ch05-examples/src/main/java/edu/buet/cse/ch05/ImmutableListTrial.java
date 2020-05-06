package edu.buet.cse.ch05;

import java.util.List;

/**
 * Use the factory method List.of() to create an immutable list
 * 
 * @author shamim
 */
public class ImmutableListTrial {
  public static void main(String... args) {
    List<String> wordList = List.of("This", "is", "a", "test");
    wordList.forEach(System.out::println);
    System.out.println();

    // the list is immutable
    try {
      wordList.add("world");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }

    // all arguments must be non null
    try {
      List.of("Hello", "world", null);
    } catch (NullPointerException ex) {
      System.err.println(ex);
    }
  }
}
