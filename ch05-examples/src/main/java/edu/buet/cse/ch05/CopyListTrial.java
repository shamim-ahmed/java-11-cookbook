package edu.buet.cse.ch05;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrate the use of List.copyOf() method and the immutability of the returned list
 * 
 * @author shamim
 */
public class CopyListTrial {
  public static void main(String... args) {
    List<String> wordList = Arrays.asList("This", "is", "a", "test");

    // create a new list by coping the existing one
    List<String> copiedList = List.copyOf(wordList);
    copiedList.forEach(System.out::println);

    // try to add an item to the list?
    try {
      copiedList.add("apple");
      System.out.println("word added");
    } catch (UnsupportedOperationException ex) {
      System.err.println(ex);
    }
  }
}
