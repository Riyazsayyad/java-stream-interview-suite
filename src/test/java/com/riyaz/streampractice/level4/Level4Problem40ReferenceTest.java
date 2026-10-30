package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem40Reference;

class Level4Problem40ReferenceTest {


    @Test
    void shouldConvertEmployeesToMapById() {
        List<Employee> employees = TestDataFactory.sampleEmployees();
        Map<Long, Employee> map = Problem40Reference.solve(employees);
        assertEquals(10, map.size());
        assertEquals(employees.get(0), map.get(1L));
    }

    @Test
    void shouldKeepFirstOnDuplicateId() {
        Employee first = new Employee(1, "A", 30, Department.HR, 1, "X");
        Employee duplicate = new Employee(1, "B", 31, Department.HR, 2, "Y");
        Map<Long, Employee> map = Problem40Reference.solve(List.of(first, duplicate));
        assertEquals("A", map.get(1L).getName());
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem40Reference.solve(List.of()));
    }

    @Test
    void shouldPreserveInsertionOrder() {
        List<Employee> employees = TestDataFactory.sampleEmployees().subList(0, 3);
        assertEquals(List.copyOf(Problem40Reference.solve(employees).keySet()), List.of(1L, 2L, 3L));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem40Reference.solve(null));
    }

}
