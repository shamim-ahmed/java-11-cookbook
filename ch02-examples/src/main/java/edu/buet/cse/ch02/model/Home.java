package edu.buet.cse.ch02.model;

public interface Home {
  default String getAddress() {
    return "221B Baker Street, London, UK";
  }
}
