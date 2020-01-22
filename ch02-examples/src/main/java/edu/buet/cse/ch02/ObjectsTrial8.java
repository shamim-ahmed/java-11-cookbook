package edu.buet.cse.ch02;

import java.util.Objects;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial8 {
  public static void main(String... args) {
    int[] values1 = {1, 2, 3};
    int[] values2 = {1, 2, 3};

    // shallow equals comparison fails
    System.out.println(Objects.equals(values1, values2));

    // deep equals compariosn succeeds
    System.out.println(Objects.deepEquals(values1, values2));
  }
}
