package edu.buet.cse.ch05;

import java.util.Map;

/**
 * Create a map with the static factory method Map.of()
 * 
 * @author shamim
 */
public class ImmutableMapTrial {
  public static void main(String... args) {
    Map<String, Integer> wordMap = Map.of("This", 4, "is", 2, "a", 1, "test", 4);

    wordMap.forEach((k, v) -> System.out.println(k + " : " + v));
  }
}
