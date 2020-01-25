package edu.buet.cse.ch04;

import java.util.function.Predicate;

import edu.buet.cse.ch04.model.PositivePredicate;

public class PredicateTrial {
  public static void main(String... args) {
    // you can declare your own class to implement a Predicate
    Predicate<Integer> pred1 = new PositivePredicate();
    System.out.println(pred1.test(10));

    // you can achieve the same effect using a lambda expression
    Predicate<Integer> pred2 = (Integer n) -> n != null && n > 0;
    System.out.println(pred2.test(10));
  }
}
