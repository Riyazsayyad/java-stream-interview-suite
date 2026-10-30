package com.riyaz.streampractice.reference.level5;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import com.riyaz.streampractice.model.EmployeeAnalyticsReport;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 50. Do not copy directly during practice.
 */
public final class Problem50Reference {

    private Problem50Reference() {}

    public static EmployeeAnalyticsReport solve(List<Employee> employees, double salaryThreshold) {

        if (employees == null || employees.isEmpty()) {
            return new EmployeeAnalyticsReport(Map.of(), Map.of(), Map.of(), List.of(), List.of());
        }
        Map<Department, Employee> highest = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                opt -> opt.orElse(null))));
        Map<Department, Double> avg = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Map<Department, Long> counts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        List<Department> above = avg.entrySet().stream()
                .filter(e -> e.getValue() > salaryThreshold)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparing(Enum::name))
                .collect(Collectors.toList());
        List<Employee> topThree = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparingLong(Employee::getId))
                .limit(3)
                .collect(Collectors.toList());
        return new EmployeeAnalyticsReport(highest, avg, counts, above, topThree);

    }
}
