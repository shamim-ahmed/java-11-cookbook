package edu.buet.cse.ch04.model;

/**
 * Note that this class does not override equals, hashCode or toString method. But these methods
 * were declared in Vehicle super-interface. The actual implementations of these methods are
 * inherited from Object class, as usual.
 * 
 * @author shamim
 *
 */
public class Mazda implements Car {
  @Override
  public double getSpeed() {
    return 100.0;
  }
}
