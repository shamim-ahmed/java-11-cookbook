package edu.buet.cse.ch02;

import java.util.Comparator;
import java.util.Objects;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial {
  public static void main(String... args) {
    int result = Objects.compare("a", "c", Comparator.naturalOrder());
    System.out.println(result);
    
    result = Objects.compare("c", "a", Comparator.reverseOrder());
    System.out.println(result);
    
    // if both objects are null, then result is 0
    result = Objects.compare(null, null, Comparator.naturalOrder());
    System.out.println(result);
    
    try {
      // if one object is null, then NPE is thrown
      result = Objects.compare("a", null, Comparator.naturalOrder());
    } catch (Exception ex) {
      System.err.println(ex);
    }
  }
}
