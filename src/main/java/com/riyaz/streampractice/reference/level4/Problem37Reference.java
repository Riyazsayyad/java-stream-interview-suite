package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 37. Do not copy directly during practice.
 */
public final class Problem37Reference {

    private Problem37Reference() {}

    public static Map<Department, Employee> solve(List<Employee> employees) {

        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
                                        .thenComparing(Comparator.comparingLong(Employee::getId).reversed())),
                                opt -> opt.orElse(null))));

    }
}
