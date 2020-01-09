package edu.buet.cse.ch02.model;

@FunctionalInterface
public interface Truck {
  double getCapacityInPounds();

  default double getCapacityInKilos() {
    return 0.454 * getCapacityInPounds();
  }

  static String getVehicleType() {
    return "TRUCK";
  }
}
