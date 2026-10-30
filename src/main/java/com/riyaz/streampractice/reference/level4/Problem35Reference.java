package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 35. Do not copy directly during practice.
 */
public final class Problem35Reference {

    private Problem35Reference() {}

    public static Optional<Employee> solve(List<Employee> employees) {

        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        List<Double> salaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        if (salaries.size() < 2) {
            return Optional.empty();
        }
        double second = salaries.get(1);
        return employees.stream()
                .filter(e -> e.getSalary() == second)
                .min(Comparator.comparingLong(Employee::getId));

    }
}
