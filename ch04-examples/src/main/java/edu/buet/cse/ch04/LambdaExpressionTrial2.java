package edu.buet.cse.ch04;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class LambdaExpressionTrial2 {
  public static void main(String... args) {
    IntFunction<String> intFunc = i -> Integer.toHexString(i);
    System.out.println(intFunc.apply(255));

    BiFunction<String, Integer, Integer> biFunc = (s, i) -> s.length() + i * 10;
    System.out.println(biFunc.apply("hello", 6));

    UnaryOperator<Integer> unaryOp = i -> ++i;
    System.out.println(unaryOp.apply(6));

    BinaryOperator<Integer> binaryOp = (a, b) -> a + 10 * b;
    System.out.println(binaryOp.apply(5, 3));
    
    IntBinaryOperator intBinaryOp = (i, j) -> i > j ? i : j;
    System.out.println(intBinaryOp.applyAsInt(7, 14));
  }
}
