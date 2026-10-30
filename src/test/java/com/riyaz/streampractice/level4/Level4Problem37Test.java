package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level4.Problem37;

class Level4Problem37Test {


    @Test
    void shouldFindHighestPaidInEachDepartment() {
        Map<Department, Employee> top = Problem37.solve(TestDataFactory.sampleEmployees());
        assertEquals(1L, top.get(Department.ENGINEERING).getId());
        assertEquals(10L, top.get(Department.FINANCE).getId());
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem37.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        assertEquals(e, Problem37.solve(List.of(e)).get(e.getDepartment()));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem37.solve(null));
    }

    @Test
    void shouldIncludeEveryDepartmentPresent() {
        Employee e = new Employee(99, "Z", 40, Department.OPERATIONS, 70_000, "X");
        assertEquals(e, Problem37.solve(List.of(e)).get(Department.OPERATIONS));
    }

}
