package edu.buet.cse.ch04.model;

import java.util.function.Predicate;

public class PositivePredicate implements Predicate<Integer> {
  public boolean test(Integer val) {
    return val != null && val > 0;
  }
}
