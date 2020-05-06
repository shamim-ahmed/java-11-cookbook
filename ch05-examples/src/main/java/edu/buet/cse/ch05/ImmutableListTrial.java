package edu.buet.cse.ch05;

import java.util.List;

/**
 * Use the factory method List.of() to create an immutable list
 * 
 * @author shamim
 */
public class ImmutableListTrial {
  public static void main(String... args) {
    // all arguments must be non null
    List<String> wordList = List.of("This", "is", "a", "test");

    wordList.forEach(System.out::println);
  }
}
