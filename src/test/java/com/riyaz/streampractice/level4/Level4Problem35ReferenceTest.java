package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem35Reference;

class Level4Problem35ReferenceTest {


    @Test
    void shouldFindSecondHighestPaidEmployee() {
        Optional<Employee> second = Problem35Reference.solve(TestDataFactory.sampleEmployees());
        assertTrue(second.isPresent());
        assertEquals(120_000, second.get().getSalary());
        assertEquals(1L, second.get().getId());
    }

    @Test
    void shouldReturnEmptyWhenOnlyOneDistinctSalary() {
        Employee e1 = new Employee(1, "A", 30, Department.HR, 50_000, "X");
        Employee e2 = new Employee(2, "B", 31, Department.HR, 50_000, "Y");
        assertEquals(Optional.empty(), Problem35Reference.solve(List.of(e1, e2)));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem35Reference.solve(List.of()));
    }

    @Test
    void shouldPickLowestIdOnSalaryTieForSecondRank() {
        Employee a = new Employee(1, "A", 30, Department.HR, 90_000, "X");
        Employee b = new Employee(2, "B", 31, Department.HR, 90_000, "Y");
        Employee c = new Employee(3, "C", 32, Department.HR, 100_000, "Z");
        Optional<Employee> second = Problem35Reference.solve(List.of(a, b, c));
        assertEquals(1L, second.get().getId());
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem35Reference.solve(null));
    }

}
