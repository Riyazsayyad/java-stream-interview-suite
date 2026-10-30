package com.riyaz.streampractice.reference.level5;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 47. Do not copy directly during practice.
 */
public final class Problem47Reference {

    private Problem47Reference() {}

    public static Map<Department, List<Employee>> solve(List<Employee> employees) {

        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                                        .thenComparingLong(Employee::getId))
                                .limit(3)
                                .collect(Collectors.toList()))));

    }
}
