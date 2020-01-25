package edu.buet.cse.ch02;

import java.util.Arrays;
import java.util.Objects;

import edu.buet.cse.ch02.model.Employee;

/**
 * Experiment with various utility methods in Objects class
 * 
 * @author shamim
 *
 */
public class ObjectsTrial9 {
  public static void main(String... args) {
    Employee employee1 = new Employee(1L, "John Denver", 10000);
    Employee employee2 = new Employee(2L, "Norah Jones", 12500);
    Employee employee3 = new Employee(3L, "Taylor Swift", 15000);

    Employee employee4 = new Employee(1L, "John Denver", 10000);
    Employee employee5 = new Employee(2L, "Norah Jones", 12500);
    Employee employee6 = new Employee(3L, "Taylor Swift", 15000);

    Employee[] employeeArray1 = {employee1, employee2, employee3};
    Employee[] employeeArray2 = {employee4, employee5, employee6};

    // shallow equals comparison fails
    System.out.println(Objects.equals(employeeArray1, employeeArray2));

    // deep equals comparison succeeds
    System.out.println(Objects.deepEquals(employeeArray1, employeeArray2));

    // an alternative way to perform deep equals comparison
    System.out.println(Arrays.deepEquals(employeeArray1, employeeArray2));
  }
}
