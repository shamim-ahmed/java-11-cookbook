package edu.buet.cse.ch04.model;

import java.util.function.Function;

/**
 * A function that multiplies the incoming value by 10
 * 
 * @author shamim
 *
 */
public class MultiplyFunction implements Function<Double, Double> {
  @Override
  public Double apply(Double val) {
    return val * 10.0;
  }
}
