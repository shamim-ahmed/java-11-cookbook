package edu.buet.cse.ch04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionTrial {
  public static void main(String... args) {
    Function<Integer, Double> func = i -> i * 10.0;
    System.out.println(func.apply(5));

    Consumer<String> consumer = s -> System.out.println("The value " + s + " is consumed");
    consumer.accept("Abracadabra");

    Supplier<String> supplier = () -> "Success";
    System.out.println("The value obtained from supplier is " + supplier.get());

    Predicate<Double> predicate = val -> {
      System.out.println("Checking if " + val + " is less than 20.0");
      return val < 20.0;
    };

    System.out.println(predicate.test(25.0));
  }
}
