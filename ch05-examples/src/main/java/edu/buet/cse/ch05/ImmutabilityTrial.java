package edu.buet.cse.ch05;

import java.util.List;

/**
 * Demonstrate the immutability of the list constructed via List.of() method
 * @author shamim
 *
 */
public class ImmutabilityTrial {
  public static void main(String... args) {
    List<String> wordList = List.of("This", "is", "a", "test");

    // can we add an item to the list?
    try {
      wordList.add("apple");
      System.out.println("word added");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }

    // can we modify an item?
    try {
      wordList.set(1, "apple");
      System.out.println("word modified");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
