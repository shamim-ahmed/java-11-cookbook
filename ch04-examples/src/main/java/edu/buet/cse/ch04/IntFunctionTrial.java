package edu.buet.cse.ch04;

import java.util.function.IntFunction;

/**
 * An example that uses the built-in IntFunction interface
 * 
 * @author shamim
 *
 */
public class IntFunctionTrial {
  public static void main(String... args) {
    // for an IntFunction, the input is a primitive int value
    // the output is the specified generic type
    IntFunction<String> func = (int val) -> Integer.toHexString(val);
    String result = func.apply(65535);
    System.out.println(result);
  }
}
