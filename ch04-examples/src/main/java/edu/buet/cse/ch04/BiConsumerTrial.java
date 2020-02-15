package edu.buet.cse.ch04;

import java.util.function.BiConsumer;

public class BiConsumerTrial {
  public static void main(String... args) {
    BiConsumer<Integer, Integer> adder = (a, b) -> {
      int result = a + b;
      System.out.println(result);
    };

    adder.accept(5, 9);
  }
}
