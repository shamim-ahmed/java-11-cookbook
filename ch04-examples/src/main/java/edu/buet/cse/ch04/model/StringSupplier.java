package edu.buet.cse.ch04.model;

import java.util.function.Supplier;

public class StringSupplier implements Supplier<String> {
  @Override
  public String get() {
    return "Hello World";
  }
}
