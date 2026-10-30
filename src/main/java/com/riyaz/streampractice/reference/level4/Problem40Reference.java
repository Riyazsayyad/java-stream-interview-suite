package com.riyaz.streampractice.reference.level4;

import com.riyaz.streampractice.model.Employee;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 40. Do not copy directly during practice.
 */
public final class Problem40Reference {

    private Problem40Reference() {}

    public static Map<Long, Employee> solve(List<Employee> employees) {

        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity(), (left, right) -> left, LinkedHashMap::new));

    }
}
