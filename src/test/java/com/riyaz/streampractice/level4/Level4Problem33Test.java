package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level4.Problem33;

class Level4Problem33Test {


    @Test
    void shouldGroupEmployeesByDepartment() {
        Map<Department, List<Employee>> grouped = Problem33.solve(TestDataFactory.sampleEmployees());
        assertEquals(3, grouped.get(Department.ENGINEERING).size());
        assertTrue(grouped.containsKey(Department.SALES));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem33.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        Map<Department, List<Employee>> grouped = Problem33.solve(List.of(e));
        assertEquals(1, grouped.get(e.getDepartment()).size());
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem33.solve(null));
    }

    @Test
    void shouldKeepAllDepartmentsSeparate() {
        List<Employee> employees = TestDataFactory.sampleEmployees();
        assertEquals(6, Problem33.solve(employees).size());
    }

}
