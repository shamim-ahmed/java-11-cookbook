package edu.buet.cse.ch02;

import edu.buet.cse.ch02.model.Truck;
import edu.buet.cse.ch02.model.TruckImpl;

public class TruckTrial {
  public static void main(String... args) {
    var tr = new TruckImpl();
    System.out.printf("Vehicle type %s has a capacity of %.2f kg%n", Truck.getVehicleType(),
        tr.getCapacityInKilos());
  }
}
