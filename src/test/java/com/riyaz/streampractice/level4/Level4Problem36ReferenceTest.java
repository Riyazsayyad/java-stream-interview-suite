package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem36Reference;

class Level4Problem36ReferenceTest {


    @Test
    void shouldCalculateAverageSalaryByDepartment() {
        Map<Department, Double> averages = Problem36Reference.solve(TestDataFactory.sampleEmployees());
        assertTrue(averages.get(Department.ENGINEERING) > 110_000);
        assertTrue(averages.containsKey(Department.FINANCE));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem36Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        assertEquals(e.getSalary(), Problem36Reference.solve(List.of(e)).get(e.getDepartment()));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem36Reference.solve(null));
    }

    @Test
    void shouldAverageWithinSameDepartmentOnly() {
        List<Employee> employees = TestDataFactory.sampleEmployees();
        double salesAvg = Problem36Reference.solve(employees).get(Department.SALES);
        assertEquals(100_000.0, salesAvg);
    }

}
