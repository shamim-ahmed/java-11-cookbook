package edu.buet.cse.ch04.model;

import java.util.function.Consumer;

public class StringConsumer implements Consumer<String> {
  @Override
  public void accept(String s) {
    System.out.println("The string '" + s + "' has been consumed");
  }
}
