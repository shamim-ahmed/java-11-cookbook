package edu.buet.cse.ch04;

import java.util.function.Supplier;

import edu.buet.cse.ch04.model.StringSupplier;

public class SupplierTrial {
  public static void main(String... args) {
    // you can declare a separate class for Supplier implementation
    Supplier<String> supplier1 = new StringSupplier();
    System.out.println(supplier1.get());

    // you can also achieve the same result by using lambda expression
    Supplier<String> supplier2 = () -> "Hello World";
    System.out.println(supplier2.get());
  }
}
