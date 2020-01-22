package edu.buet.cse.ch02;

import java.util.Objects;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial5 {
  public static void main(String... args) {
    String message = "There is no compulsion in religion";
    printHashCode(message);
    printHashCode(null);
  }

  private static void printHashCode(String message) {
    int result = Objects.hashCode(message);
    System.out.printf("message = %s, hashCode = %d%n", message, result);
  }
}
