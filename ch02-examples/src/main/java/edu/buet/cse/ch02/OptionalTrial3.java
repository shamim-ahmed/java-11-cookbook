package edu.buet.cse.ch02;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTrial3 {
  public static void main(String... args) {
    Consumer<Integer> consumer = val -> printMessage(val);
    Runnable r = () -> System.out.println("No result is available");

    Optional<Integer> result1 = Optional.empty();
    result1.ifPresentOrElse(consumer, r);

    Optional<Integer> result2 = Optional.of(10000);
    result2.ifPresentOrElse(consumer, r);
  }

  private static void printMessage(int n) {
    if (n <= 0) {
      System.out.println("We've lost again");
    } else {
      System.out.printf("We've won %d dollars ! Let's party !!", n);
    }
  }
}
