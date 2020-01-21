package edu.buet.cse.ch02;

import java.util.List;
import java.util.Objects;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial3 {
  public static void main(String... args) {
    List<Integer> valueList = List.of(1, 2);
    int result = Objects.checkIndex(0, valueList.size());
    System.out.println(result);

    try {
      result = Objects.checkIndex(2, valueList.size());
      System.out.println(result);
    } catch (IndexOutOfBoundsException ex) {
      System.err.println(ex);
    }
  }
}
