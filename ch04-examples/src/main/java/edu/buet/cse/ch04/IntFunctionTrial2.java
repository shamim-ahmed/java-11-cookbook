package edu.buet.cse.ch04;

import java.util.function.Function;
import java.util.function.IntFunction;

public class IntFunctionTrial2 {
  public static void main(String...args) {
    IntFunction<Integer> incrementer = i -> i++;
    // try to guess the result. It may surprise you !
    System.out.println(incrementer.apply(5));
    
    Function<Integer, Integer> incrementer2 = i -> ++i;
    System.out.println(incrementer2.apply(5));
  }
}
