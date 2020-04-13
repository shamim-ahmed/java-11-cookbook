package edu.buet.cse.ch05;

import static java.util.Map.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Demonstrate that List.of(), Set.of() or Map.ofEntries() static factory methods do not accept null
 * 
 * @author shamim
 */
public class NonNullityTrial {
  public static void main(String... args) {
    // try to construct list with null
    try {
      List<String> wordList = List.<String>of("This", "is", "a", "test", null);
      System.err.println("list constructed successfully " + wordList);
    } catch (NullPointerException ex) {
      System.err.println(ex);
    }

    // try to construct set with null
    try {
      Set<String> wordSet = Set.<String>of("This", "is", "a", "test", null);
      System.out.println("set constructed successfully " + wordSet);
    } catch (NullPointerException ex) {
      System.err.println(ex);
    }

    // try to construct map with null
    try {
      Map<Integer, String> wordMap =
          Map.ofEntries(entry(1, "This"), entry(2, "is"), entry(3, "a"), entry(4, "test"), null);
      System.out.println("map constructed with null " + wordMap);
    } catch (NullPointerException ex) {
      System.err.println(ex);
    }
  }
}
