package edu.buet.cse.ch05;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Usage of the List.of(), Set.of() and Map.of() static factory methods.
 * 
 * @author shamim
 */
public class StaticFactoryTrial {
  public static void main(String... args) {
    // order is guaranteed
    List<String> wordList = List.of("This", "is", "a", "test");
    wordList.forEach(System.out::println);
    System.out.println();

    // no order is guaranteed
    Set<String> wordSet = Set.of("This", "is", "another", "test");
    wordSet.forEach(System.out::println);
    System.out.println();

    // no order is guaranteed
    Map<Integer, String> wordMap = Map.of(1, "This", 2, "is", 3, "the", 4, "third", 5, "test");
    wordMap.forEach((k, v) -> System.out.println(v));
  }
}
