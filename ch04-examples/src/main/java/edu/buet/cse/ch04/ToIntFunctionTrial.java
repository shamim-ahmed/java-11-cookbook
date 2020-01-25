package edu.buet.cse.ch04;

import java.util.function.ToIntFunction;

/**
 * An example that uses the built-in ToIntFunction interface
 * 
 * @author shamim
 *
 */
public class ToIntFunctionTrial {
  public static void main(String... args) {
    // for a ToIntFunction interface, the input is the specified generic type
    // the output is a primitive int value
    ToIntFunction<String> func = (String s) -> Integer.parseInt(s);
    int result = func.applyAsInt("314"); // note the method name
    System.out.println(result);
  }
}
