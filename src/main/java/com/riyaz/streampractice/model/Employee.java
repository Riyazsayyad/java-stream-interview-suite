package com.riyaz.streampractice.model;

import java.util.Objects;

/**
 * Employee record for stream grouping and aggregation exercises.
 */
public final class Employee {

    private final long id;
    private final String name;
    private final int age;
    private final Department department;
    private final double salary;
    private final String city;

    public Employee(
            long id,
            String name,
            int age,
            Department department,
            double salary,
            String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id="
                + id
                + ", name='"
                + name
                + '\''
                + ", department="
                + department
                + ", salary="
                + salary
                + '}';
    }
}
