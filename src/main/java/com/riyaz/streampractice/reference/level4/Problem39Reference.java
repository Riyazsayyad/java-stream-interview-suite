package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 39. Do not copy directly during practice.
 */
public final class Problem39Reference {

    private Problem39Reference() {}

    public static Optional<Department> solve(List<Employee> employees) {

        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.<Map.Entry<Department, Long>>comparingLong(Map.Entry::getValue)
                        .thenComparing(e -> e.getKey().name(), Comparator.reverseOrder()))
                .map(Map.Entry::getKey);

    }
}
