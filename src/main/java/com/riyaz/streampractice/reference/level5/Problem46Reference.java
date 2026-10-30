package com.riyaz.streampractice.reference.level5;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 46. Do not copy directly during practice.
 */
public final class Problem46Reference {

    private Problem46Reference() {}

    public static Map<Department, Double> solve(List<Employee> employees) {

        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

    }
}
