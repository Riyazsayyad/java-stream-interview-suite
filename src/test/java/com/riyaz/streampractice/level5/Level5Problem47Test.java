package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem47;

class Level5Problem47Test {


    @Test
    void shouldReturnTopThreePerDepartment() {
        Map<Department, List<Employee>> top = Problem47.solve(TestDataFactory.sampleEmployees());
        assertEquals(3, top.get(Department.ENGINEERING).size());
        assertEquals(120_000, top.get(Department.ENGINEERING).get(0).getSalary());
    }

    @Test
    void shouldLimitWhenLessThanThreeInDepartment() {
        Employee e = TestDataFactory.sampleEmployees().get(4);
        Map<Department, List<Employee>> top = Problem47.solve(List.of(e));
        assertEquals(1, top.get(e.getDepartment()).size());
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem47.solve(List.of()));
    }

    @Test
    void shouldSortBySalaryThenId() {
        Employee a = new Employee(2, "A", 30, Department.HR, 100, "X");
        Employee b = new Employee(1, "B", 30, Department.HR, 100, "Y");
        List<Employee> deptTop = Problem47.solve(List.of(a, b)).get(Department.HR);
        assertEquals(1L, deptTop.get(0).getId());
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem47.solve(null));
    }

}
