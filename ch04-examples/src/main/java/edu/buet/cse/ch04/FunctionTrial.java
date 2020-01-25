package edu.buet.cse.ch04;

import java.util.function.Function;

import edu.buet.cse.ch04.model.MultiplyFunction;

public class FunctionTrial {
  public static void main(String... args) {
    // we can declare our function implementation as a separate class
    Function<Double, Double> func1 = new MultiplyFunction();
    Double result1 = func1.apply(5.0);
    System.out.println(result1);

    // we can use lambda expression to achieve the same outcome
    Function<Double, Double> func2 = v -> 10.0 * v;
    Double result2 = func2.apply(5.0);
    System.out.println(result2);
  }
}
