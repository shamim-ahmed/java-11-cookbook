package edu.buet.cse.ch04.model;

/**
 * A functional interface that corresponds to a function with three arguments
 * 
 * @author shamim
 *
 * @param <T> first input type
 * @param <U> second input type
 * @param <V> third input type
 * @param <R> output type
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
  R apply(T t, U u, V v);
}
