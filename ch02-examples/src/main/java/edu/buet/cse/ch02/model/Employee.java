package edu.buet.cse.ch02.model;

import java.util.Objects;

public class Employee {
  private final long id;
  private final String name;
  private final double salary;

  public Employee(long id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Employee)) {
      return false;
    }

    Employee other = (Employee) obj;
    return id == other.id && name == other.name && salary == other.salary;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salary);
  }

  @Override
  public String toString() {
    return "[" + id + ", " + name + ", " + salary + "]";
  }
}
