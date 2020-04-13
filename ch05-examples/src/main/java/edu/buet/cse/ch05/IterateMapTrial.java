package edu.buet.cse.ch05;

import java.util.HashMap;
import java.util.Map;

/**
 * Iterate a Map using Map.forEach() method
 * 
 * @author shamim
 *
 */
public class IterateMapTrial {
  public static void main(String... args) {
    Map<Integer, String> wordMap = new HashMap<>();
    wordMap.put(1, "This");
    wordMap.put(2, "is");
    wordMap.put(3, "a");
    wordMap.put(4, "test");

    // one way of iterating the map
    wordMap.forEach((k, v) -> System.out.println(v));
    System.out.println();

    // another way of iterating the map entries
    wordMap.entrySet().forEach(e -> System.out.println(e.getValue()));
  }
}
