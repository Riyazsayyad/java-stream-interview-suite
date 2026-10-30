package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level5.Problem46Reference;

class Level5Problem46ReferenceTest {


    @Test
    void shouldCalculateTotalSalaryByDepartment() {
        Map<Department, Double> totals = Problem46Reference.solve(TestDataFactory.sampleEmployees());
        assertEquals(350_000.0, totals.get(Department.ENGINEERING));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem46Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        assertEquals(e.getSalary(), Problem46Reference.solve(List.of(e)).get(e.getDepartment()));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem46Reference.solve(null));
    }

    @Test
    void shouldSumMultipleInSameDepartment() {
        Map<Department, Double> totals = Problem46Reference.solve(TestDataFactory.sampleEmployees());
        assertTrue(totals.get(Department.SALES) > 0);
    }

}
