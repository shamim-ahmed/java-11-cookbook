package edu.buet.cse.ch05;

import java.util.Set;

/**
 * Demonstrate the use of Set.copyOf() method and the immutability of the returned list
 * 
 * @author shamim
 */
public class CopySetTrial {
  public static void main(String... args) {
    Set<String> wordSet = Set.<String>of("This", "is", "a", "test");

    // create a new set by copying the existing set
    Set<String> copiedSet = Set.copyOf(wordSet);
    copiedSet.forEach(System.out::println);

    // try to add a new word to the set
    try {
      copiedSet.add("apple");
      System.out.println("word added");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
