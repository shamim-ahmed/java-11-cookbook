package edu.buet.cse.ch04;

import java.util.function.Function;

/**
 * An example on function composition
 * 
 * @author shamim
 *
 */
public class FunctionTrial3 {
  public static void main(String... args) {
    double factor = 10.0;
    Function<Integer, Double> additionFunction = (Integer val) -> val + factor;
    Function<Double, String> multiplyFunction = (Double val) -> String.format("%.2f", val * factor);

    Function<Integer, String> compositionFunction = multiplyFunction.compose(additionFunction);
    System.out.println(compositionFunction.apply(5));
  }
}
