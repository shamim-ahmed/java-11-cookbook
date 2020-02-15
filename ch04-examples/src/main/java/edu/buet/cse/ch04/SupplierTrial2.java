package edu.buet.cse.ch04;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierTrial2 {
  public static void main(String... args) {
    Supplier<Double> answerSupplier = () -> 42.0;
    System.out.println("The answer to life, universe and everything is " + answerSupplier.get());

    DoubleSupplier answerSupplier2 = () -> 42.0;
    System.out.println(
        "The (primitive) answer to life, universe and everything is " + answerSupplier2.getAsDouble());
  }
}
