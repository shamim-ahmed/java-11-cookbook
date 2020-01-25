package edu.buet.cse.ch04;

import java.util.function.Function;

/**
 * An example of using the identity function
 * 
 * @author shamim
 *
 */
public class FunctionTrial4 {
  public static void main(String... args) {
    Function<Integer, Integer> identityFunction = Function.identity();
    System.out.println(identityFunction.apply(5));
  }
}
