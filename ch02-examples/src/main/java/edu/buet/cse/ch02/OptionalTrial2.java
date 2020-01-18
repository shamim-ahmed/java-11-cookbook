package edu.buet.cse.ch02;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTrial2 {
  public static void main(String... args) {
    Optional<Integer> prize1 = Optional.empty();
    System.out.println(prize1.isPresent());
    System.out.println(prize1);
    System.out.println();

    Optional<Integer> prize2 = Optional.of(5000);
    System.out.println(prize2.isPresent());
    System.out.println(prize2);
    System.out.println();

    Optional<Integer> prize3 = Optional.ofNullable(null);
    System.out.println(prize3.isPresent());
    System.out.println(prize3);
    System.out.println();

    Optional<Integer> prize4 = Optional.empty();
    Optional<Integer> prize5 = Optional.empty();
    Optional<Integer> prize6 = Optional.ofNullable(null);
    System.out.println(prize4.equals(prize5));
    System.out.println(prize5.equals(prize6));
    System.out.println();

    Optional<Integer> prize7 = Optional.of(50000);
    Optional<Integer> prize8 = Optional.of(50000);
    Optional<Integer> prize9 = Optional.of(1000);
    System.out.println(prize7.equals(prize8));
    System.out.println(prize8.equals(prize9));
    System.out.println();

    Optional<Integer> prize10 = Optional.empty();
    Integer n10 = prize10.orElse(0);
    System.out.println(n10);
    Optional<Integer> prize11 = Optional.empty();
    Integer n11 = prize11.orElseGet(() -> 10);
    System.out.println(n11);
    System.out.println();

    Optional<Integer> prize12 = Optional.empty();

    try {
      Integer n12 = prize12.orElseThrow();
      System.out.println(n12);
    } catch (NoSuchElementException ex) {
      System.err.println(ex);
    }
  }
}
