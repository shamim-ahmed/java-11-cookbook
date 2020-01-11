package edu.buet.cse.ch02.model;

public interface Office {
  default String getAddress() {
    return "Victoria Embankment, Westminster, London SW1A 2JL, UK";
  }
}
