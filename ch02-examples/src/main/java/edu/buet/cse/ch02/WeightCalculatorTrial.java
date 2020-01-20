package edu.buet.cse.ch02;

import edu.buet.cse.ch02.model.WeightCalculator;
import edu.buet.cse.ch02.model.WeightCalculatorImpl;

public class WeightCalculatorTrial {
  public static void main(String... args) {
    WeightCalculator calculator = new WeightCalculatorImpl();
    double result1 = calculator.addWeights(1.0, 2.0, 3.0, 4.0, 5.0);
    System.out.println(result1);

    double weightInKg = 5.0;
    double weightInLb = calculator.convertToPound(weightInKg);
    System.out.printf("The weight of the luggage is %.3f kilograms, or %.3f pounds%n", weightInKg,
        weightInLb);
  }
}
