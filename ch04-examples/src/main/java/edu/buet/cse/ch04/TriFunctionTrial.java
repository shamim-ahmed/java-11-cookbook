package edu.buet.cse.ch04;

import edu.buet.cse.ch04.model.TriFunction;

/**
 * An example that uses the TriFunction interface that we've declared.
 * 
 * @author shamim
 *
 */
public class TriFunctionTrial {
  public static void main(String... args) {
    TriFunction<Integer, Short, Long, Double> func =
        (Integer i, Short s, Long v) -> (i.doubleValue() + s.doubleValue()) * v.doubleValue();
    Double result = func.apply(5, Short.valueOf((short) 10), 15L);
    System.out.println(result);
  }
}
