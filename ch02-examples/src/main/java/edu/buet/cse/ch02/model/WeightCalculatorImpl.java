package edu.buet.cse.ch02.model;

import java.util.stream.DoubleStream;

public class WeightCalculatorImpl implements WeightCalculator {
  @Override
  public double addWeights(double... values) {
    DoubleStream stream = DoubleStream.of(values);
    return stream.sum();
  }
}
