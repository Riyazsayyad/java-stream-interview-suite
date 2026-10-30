package com.riyaz.streampractice.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Aggregated employee analytics for advanced stream problems.
 */
public final class EmployeeAnalyticsReport {

    private final Map<Department, Employee> highestPaidByDepartment;
    private final Map<Department, Double> averageSalaryByDepartment;
    private final Map<Department, Long> employeeCountByDepartment;
    private final List<Department> departmentsAboveAverageThreshold;
    private final List<Employee> topThreeHighestPaidOrganizationWide;

    public EmployeeAnalyticsReport(
            Map<Department, Employee> highestPaidByDepartment,
            Map<Department, Double> averageSalaryByDepartment,
            Map<Department, Long> employeeCountByDepartment,
            List<Department> departmentsAboveAverageThreshold,
            List<Employee> topThreeHighestPaidOrganizationWide) {
        this.highestPaidByDepartment = highestPaidByDepartment;
        this.averageSalaryByDepartment = averageSalaryByDepartment;
        this.employeeCountByDepartment = employeeCountByDepartment;
        this.departmentsAboveAverageThreshold = departmentsAboveAverageThreshold;
        this.topThreeHighestPaidOrganizationWide = topThreeHighestPaidOrganizationWide;
    }

    public Map<Department, Employee> getHighestPaidByDepartment() {
        return highestPaidByDepartment;
    }

    public Map<Department, Double> getAverageSalaryByDepartment() {
        return averageSalaryByDepartment;
    }

    public Map<Department, Long> getEmployeeCountByDepartment() {
        return employeeCountByDepartment;
    }

    public List<Department> getDepartmentsAboveAverageThreshold() {
        return departmentsAboveAverageThreshold;
    }

    public List<Employee> getTopThreeHighestPaidOrganizationWide() {
        return topThreeHighestPaidOrganizationWide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeAnalyticsReport that = (EmployeeAnalyticsReport) o;
        return Objects.equals(highestPaidByDepartment, that.highestPaidByDepartment)
                && Objects.equals(averageSalaryByDepartment, that.averageSalaryByDepartment)
                && Objects.equals(employeeCountByDepartment, that.employeeCountByDepartment)
                && Objects.equals(departmentsAboveAverageThreshold, that.departmentsAboveAverageThreshold)
                && Objects.equals(topThreeHighestPaidOrganizationWide, that.topThreeHighestPaidOrganizationWide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                highestPaidByDepartment,
                averageSalaryByDepartment,
                employeeCountByDepartment,
                departmentsAboveAverageThreshold,
                topThreeHighestPaidOrganizationWide);
    }
}
