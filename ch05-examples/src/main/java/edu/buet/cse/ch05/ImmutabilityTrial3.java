package edu.buet.cse.ch05;

import static java.util.Map.entry;

import java.util.Map;

/**
 * Demonstrate the immutability of map instance constructed via Map.ofEntries() method
 * 
 * @author shamim
 */
public class ImmutabilityTrial3 {
  public static void main(String... args) {
    Map<Integer, String> wordMap =
        Map.ofEntries(entry(1, "This"), entry(2, "is"), entry(3, "a"), entry(4, "test"));

    // you cannot add additional entries to the map
    try {
      wordMap.put(5, "apple");
      System.out.println("added word");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }

    // you cannot modify an existing entry
    try {
      wordMap.replace(1, "apple");
      System.out.println("replaced word");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
