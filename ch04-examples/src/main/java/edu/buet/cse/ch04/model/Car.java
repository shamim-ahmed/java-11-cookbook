package edu.buet.cse.ch04.model;

@FunctionalInterface
public interface Car extends Vehicle {
  // you can override a method from your super-interface and mark your implementation with default
  // keyword
  @Override
  default VehicleType getVehicleType() {
    return VehicleType.SMALL;
  }

  // this is the abstract method that makes Car a functional interface
  double getSpeed();
}
