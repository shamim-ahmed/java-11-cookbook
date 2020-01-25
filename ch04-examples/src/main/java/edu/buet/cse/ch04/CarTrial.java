package edu.buet.cse.ch04;

import edu.buet.cse.ch04.model.Car;
import edu.buet.cse.ch04.model.Mazda;

public class CarTrial {
  public static void main(String... args) {
    Car car1 = new Mazda();
    System.out.println(car1.toString());
    System.out.println(car1.getSpeed());
    System.out.println();

    // Car is a functional interface, so we can instantiate an instance using lambda
    Car car2 = () -> 75.0;
    System.out.println(car2.toString());
    System.out.println(car2.getSpeed());
  }
}
