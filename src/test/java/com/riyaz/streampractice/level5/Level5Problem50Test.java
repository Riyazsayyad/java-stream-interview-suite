package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem50;

class Level5Problem50Test {


    @Test
    void shouldBuildAdvancedEmployeeAnalyticsReport() {
        EmployeeAnalyticsReport report = Problem50.solve(TestDataFactory.sampleEmployees(), 100_000);
        assertEquals(6, report.getHighestPaidByDepartment().size());
        assertTrue(report.getAverageSalaryByDepartment().containsKey(Department.FINANCE));
        assertEquals(3L, report.getEmployeeCountByDepartment().get(Department.ENGINEERING));
        assertFalse(report.getDepartmentsAboveAverageThreshold().isEmpty());
        assertEquals(3, report.getTopThreeHighestPaidOrganizationWide().size());
    }

    @Test
    void shouldReturnEmptyReportForEmptyEmployees() {
        EmployeeAnalyticsReport report = Problem50.solve(List.of(), 1);
        assertTrue(report.getHighestPaidByDepartment().isEmpty());
        assertTrue(report.getTopThreeHighestPaidOrganizationWide().isEmpty());
    }

    @Test
    void shouldFilterDepartmentsAboveThreshold() {
        EmployeeAnalyticsReport report = Problem50.solve(TestDataFactory.sampleEmployees(), 200_000);
        assertTrue(report.getDepartmentsAboveAverageThreshold().isEmpty());
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        EmployeeAnalyticsReport report = Problem50.solve(List.of(e), 0);
        assertEquals(1, report.getTopThreeHighestPaidOrganizationWide().size());
    }

    @Test
    void shouldHandleNullEmployeesAsEmptyReport() {
        EmployeeAnalyticsReport report = Problem50.solve(null, 100_000);
        assertTrue(report.getEmployeeCountByDepartment().isEmpty());
    }

}
