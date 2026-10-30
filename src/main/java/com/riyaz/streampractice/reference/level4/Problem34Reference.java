package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Reference solution for Problem 34. Do not copy directly during practice.
 */
public final class Problem34Reference {

    private Problem34Reference() {}

    public static Optional<Employee> solve(List<Employee> employees) {

        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

    }
}
