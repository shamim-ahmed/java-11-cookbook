package edu.buet.cse.ch02;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTrial {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9);
    Optional<Integer> result = stream.filter(i -> i > 7).filter(i -> i % 2 == 0).findFirst();

    // this method is new to Java 9
    result.ifPresentOrElse(i -> System.out.printf("The result is %d%n", i),
        () -> System.out.println("No result was found"));
  }
}
