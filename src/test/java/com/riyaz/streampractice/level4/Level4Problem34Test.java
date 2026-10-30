package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level4.Problem34;

class Level4Problem34Test {


    @Test
    void shouldFindHighestPaidEmployee() {
        Optional<Employee> top = Problem34.solve(TestDataFactory.sampleEmployees());
        assertTrue(top.isPresent());
        assertEquals(10L, top.get().getId());
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem34.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        assertEquals(e, Problem34.solve(List.of(e)).get());
    }

    @Test
    void shouldHandleSalaryTieByOptionalAny() {
        List<Employee> employees = TestDataFactory.sampleEmployees();
        Optional<Employee> top = Problem34.solve(employees);
        assertEquals(125_000, top.get().getSalary());
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem34.solve(null));
    }

}
