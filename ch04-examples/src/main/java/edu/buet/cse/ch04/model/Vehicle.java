package edu.buet.cse.ch04.model;

@FunctionalInterface
public interface Vehicle {
  VehicleType getVehicleType();

  // a functional interface may contain enum declarations
  enum VehicleType {
    SMALL, MEDIUM, LARGE
  };

  // a functional interface may declare methods from Object class as abstract, and this does not
  // make it non-functional
  boolean equals(Object obj);

  int hashCode();

  String toString();
}
