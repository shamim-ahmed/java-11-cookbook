package edu.buet.cse.ch04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionTrial3 {
  public static void main(String... args) {
    Supplier<Integer> source = () -> 4;
    Function<Integer, Double> before = i -> i * 10.0;
    Function<Double, Double> after = d -> d + 10.0;
    Function<Integer, Double> process = before.andThen(after);
    Predicate<Double> condition = d -> d < 100.0;
    Consumer<Double> success = d -> System.out.println("Success:" + d);
    Consumer<Double> failure = d -> System.out.println("Failure: " + d);
    compute(source, process, condition, success, failure);
  }

  private static void compute(Supplier<Integer> source, Function<Integer, Double> process,
      Predicate<Double> condition, Consumer<Double> success, Consumer<Double> failure) {
    Integer n = source.get();
    Double result = process.apply(n);

    if (condition.test(result)) {
      success.accept(result);
    } else {
      failure.accept(result);
    }
  }
}
