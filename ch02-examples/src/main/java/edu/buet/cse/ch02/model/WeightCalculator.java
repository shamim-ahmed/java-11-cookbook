package edu.buet.cse.ch02.model;

/**
 * This example demonstrates the use of a private interface method
 * 
 * @author shamim
 */
@FunctionalInterface
public interface WeightCalculator {
  double POUND_TO_KG_CONVERSION_FACTOR = 0.454;
  double KG_TO_POUND_CONVERSION_FACTOR = 2.203;

  double addWeights(double... values);

  default double convertToPound(double weightInKg) {
    return convert(weightInKg, KG_TO_POUND_CONVERSION_FACTOR);
  }

  default double convertToKg(double weightInLb) {
    return convert(weightInLb, POUND_TO_KG_CONVERSION_FACTOR);
  }

  // private method to contain common, reusable logic
  private double convert(double amount, double conversionFactor) {
    return amount * conversionFactor;
  }
}
