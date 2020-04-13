package edu.buet.cse.ch05;

import java.util.HashSet;
import java.util.Set;

/**
 * Iterate a Set using Set.forEach() method
 * 
 * @author shamim
 */
public class IterateSetTrial {
  public static void main(String... args) {
    Set<String> wordSet = new HashSet<>();
    wordSet.add("This");
    wordSet.add("is");
    wordSet.add("a");
    wordSet.add("test");

    // what will be the order of the words printed?
    wordSet.forEach(System.out::println);
  }
}
