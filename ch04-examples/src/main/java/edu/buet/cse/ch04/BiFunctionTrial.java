package edu.buet.cse.ch04;

import java.util.function.BiFunction;

public class BiFunctionTrial {
  public static void main(String... args) {
    BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
    System.out.println(adder.apply(5, 7));

    BiFunction<Integer, Integer, String> adder2 = (a, b) -> {
      int r = a + b;
      return Integer.toHexString(r);
    };

    System.out.println(adder2.apply(155, 100));
  }
}
