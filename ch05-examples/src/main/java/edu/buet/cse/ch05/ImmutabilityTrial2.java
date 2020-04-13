package edu.buet.cse.ch05;

import java.util.Set;

/**
 * Demonstrate the immutability of the Set constructed via Set.of() method
 * 
 * @author shamim
 */
public class ImmutabilityTrial2 {
  /**
   * @param args
   */
  public static void main(String... args) {
    // note the weird syntax on the right hand side of the assignment operator, which is valid
    Set<String> wordSet = Set.<String>of("This", "is", "a", "test");

    try {
      wordSet.add("apple");
      System.out.println("word added");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
