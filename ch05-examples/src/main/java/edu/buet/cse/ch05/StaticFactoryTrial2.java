package edu.buet.cse.ch05;

import java.util.Map;

/**
 * Usage of the Map.ofEntries() method
 * 
 * @author shamim
 */
public class StaticFactoryTrial2 {
  public static void main(String... args) {
    Map<Integer, String> wordMap = Map.ofEntries(Map.entry(1, "This"), Map.entry(2, "is"),
        Map.entry(3, "a"), Map.entry(4, "test"));

    wordMap.forEach((k, v) -> System.out.println(v));
  }
}
