package edu.buet.cse.ch05;

import java.util.Arrays;
import java.util.List;

public class IterateListTrial2 {
  public static void main(String... args) {
    List<String> wordList = Arrays.asList("This", "is", "a", "test");

    // what will be the order of the words printed?
    wordList.forEach(System.out::println);
  }
}
