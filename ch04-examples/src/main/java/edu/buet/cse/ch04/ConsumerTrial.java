package edu.buet.cse.ch04;

import java.util.function.Consumer;

import edu.buet.cse.ch04.model.StringConsumer;

public class ConsumerTrial {
  public static void main(String... args) {
    String message = "Redder than Red";

    // we can declare a consumer as a separate class
    Consumer<String> consumer1 = new StringConsumer();
    consumer1.accept(message);

    // we can use lambda expression to achieve the same effect
    Consumer<String> consumer2 =
        (String s) -> System.out.println("The string '" + s + "' has been consumed");
    consumer2.accept(message);
  }
}
