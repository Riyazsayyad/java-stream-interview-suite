package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 33. Do not copy directly during practice.
 */
public final class Problem33Reference {

    private Problem33Reference() {}

    public static Map<Department, List<Employee>> solve(List<Employee> employees) {

        if (employees == null) {
            return Map.of();
        }
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

    }
}
