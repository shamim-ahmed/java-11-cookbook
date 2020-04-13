package edu.buet.cse.ch05;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterate a List using List.forEach() method
 * 
 * @author shamim
 */
public class IterateListTrial {
  public static void main(String... args) {
    List<String> wordList = new ArrayList<>();
    wordList.add("This");
    wordList.add("is");
    wordList.add("a");
    wordList.add("test");

    // what will be the order of the words printed?
    wordList.forEach(System.out::println);
  }
}
