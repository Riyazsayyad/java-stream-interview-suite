package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem39Reference;

class Level4Problem39ReferenceTest {


    @Test
    void shouldFindDepartmentWithMaxEmployees() {
        assertEquals(Optional.of(Department.ENGINEERING), Problem39Reference.solve(TestDataFactory.sampleEmployees()));
    }

    @Test
    void shouldBreakTiesAlphabetically() {
        Employee e1 = new Employee(1, "A", 30, Department.SALES, 50_000, "X");
        Employee e2 = new Employee(2, "B", 31, Department.HR, 50_000, "Y");
        Employee e3 = new Employee(3, "C", 32, Department.SALES, 60_000, "Z");
        Employee e4 = new Employee(4, "D", 33, Department.HR, 60_000, "W");
        assertEquals(Optional.of(Department.HR), Problem39Reference.solve(List.of(e1, e2, e3, e4)));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem39Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleEmployee() {
        Employee e = TestDataFactory.sampleEmployees().get(0);
        assertEquals(Optional.of(e.getDepartment()), Problem39Reference.solve(List.of(e)));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem39Reference.solve(null));
    }

}
