package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level4.Problem31;
import com.riyaz.streampractice.problems.level4.Problem32;
import com.riyaz.streampractice.problems.level4.Problem33;
import com.riyaz.streampractice.problems.level4.Problem34;
import com.riyaz.streampractice.problems.level4.Problem35;
import com.riyaz.streampractice.problems.level4.Problem36;
import com.riyaz.streampractice.problems.level4.Problem37;
import com.riyaz.streampractice.problems.level4.Problem38;
import com.riyaz.streampractice.problems.level4.Problem39;
import com.riyaz.streampractice.problems.level4.Problem40;

/** Candidate tests for level 4 (problems 31–40). */
class Level4Test {

    @Nested
    @DisplayName("Problem 31: Number Frequency Map")
    class Problem31Tests {

            @Test
            void shouldBuildNumberFrequencyMap() {
                Map<Integer, Long> freq = Problem31.solve(List.of(1, 2, 2, 3, 3, 3));
                assertEquals(1L, freq.get(1));
                assertEquals(2L, freq.get(2));
                assertEquals(3L, freq.get(3));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem31.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(Map.of(7, 1L), Problem31.solve(List.of(7)));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem31.solve(null));
            }

            @Test
            void shouldCountNegativeNumbers() {
                assertEquals(Map.of(-1, 2L), Problem31.solve(List.of(-1, -1)));
            }
    }

    @Nested
    @DisplayName("Problem 32: Group Strings by Length")
    class Problem32Tests {

            @Test
            void shouldGroupStringsByLength() {
                Map<Integer, List<String>> grouped = Problem32.solve(List.of("java", "go", "python", "sql"));
                assertEquals(List.of("go"), grouped.get(2));
                assertEquals(List.of("sql"), grouped.get(3));
                assertTrue(grouped.get(4).containsAll(List.of("java")));
                assertTrue(grouped.get(6).contains("python"));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem32.solve(List.of()));
            }

            @Test
            void shouldHandleSingleString() {
                assertEquals(Map.of(3, List.of("api")), Problem32.solve(List.of("api")));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem32.solve(null));
            }

            @Test
            void shouldGroupDuplicatesSameLength() {
                Map<Integer, List<String>> grouped = Problem32.solve(List.of("aa", "bb"));
                assertEquals(2, grouped.get(2).size());
            }
    }

    @Nested
    @DisplayName("Problem 33: Group Employees by Department")
    class Problem33Tests {

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

    @Nested
    @DisplayName("Problem 34: Highest-Paid Employee")
    class Problem34Tests {

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

    @Nested
    @DisplayName("Problem 35: Second-Highest-Paid Employee")
    class Problem35Tests {

            @Test
            void shouldFindSecondHighestPaidEmployee() {
                Optional<Employee> second = Problem35.solve(TestDataFactory.sampleEmployees());
                assertTrue(second.isPresent());
                assertEquals(120_000, second.get().getSalary());
                assertEquals(1L, second.get().getId());
            }

            @Test
            void shouldReturnEmptyWhenOnlyOneDistinctSalary() {
                Employee e1 = new Employee(1, "A", 30, Department.HR, 50_000, "X");
                Employee e2 = new Employee(2, "B", 31, Department.HR, 50_000, "Y");
                assertEquals(Optional.empty(), Problem35.solve(List.of(e1, e2)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem35.solve(List.of()));
            }

            @Test
            void shouldPickLowestIdOnSalaryTieForSecondRank() {
                Employee a = new Employee(1, "A", 30, Department.HR, 90_000, "X");
                Employee b = new Employee(2, "B", 31, Department.HR, 90_000, "Y");
                Employee c = new Employee(3, "C", 32, Department.HR, 100_000, "Z");
                Optional<Employee> second = Problem35.solve(List.of(a, b, c));
                assertEquals(1L, second.get().getId());
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(Optional.empty(), Problem35.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 36: Average Salary by Department")
    class Problem36Tests {

            @Test
            void shouldCalculateAverageSalaryByDepartment() {
                Map<Department, Double> averages = Problem36.solve(TestDataFactory.sampleEmployees());
                assertTrue(averages.get(Department.ENGINEERING) > 110_000);
                assertTrue(averages.containsKey(Department.FINANCE));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem36.solve(List.of()));
            }

            @Test
            void shouldHandleSingleEmployee() {
                Employee e = TestDataFactory.sampleEmployees().get(0);
                assertEquals(e.getSalary(), Problem36.solve(List.of(e)).get(e.getDepartment()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem36.solve(null));
            }

            @Test
            void shouldAverageWithinSameDepartmentOnly() {
                List<Employee> employees = TestDataFactory.sampleEmployees();
                double salesAvg = Problem36.solve(employees).get(Department.SALES);
                assertEquals(100_000.0, salesAvg);
            }
    }

    @Nested
    @DisplayName("Problem 37: Highest-Paid Employee in Each Department")
    class Problem37Tests {

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

    @Nested
    @DisplayName("Problem 38: Partition Even and Odd Numbers")
    class Problem38Tests {

            @Test
            void shouldPartitionEvenAndOdd() {
                Map<Boolean, List<Integer>> parts = Problem38.solve(List.of(1, 2, 3, 4));
                assertEquals(List.of(2, 4), parts.get(true));
                assertEquals(List.of(1, 3), parts.get(false));
            }

            @Test
            void shouldHandleEmptyList() {
                Map<Boolean, List<Integer>> parts = Problem38.solve(List.of());
                assertTrue(parts.get(true).isEmpty());
                assertTrue(parts.get(false).isEmpty());
            }

            @Test
            void shouldTreatZeroAsEven() {
                Map<Boolean, List<Integer>> parts = Problem38.solve(List.of(0));
                assertEquals(List.of(0), parts.get(true));
            }

            @Test
            void shouldHandleNullList() {
                Map<Boolean, List<Integer>> parts = Problem38.solve(null);
                assertTrue(parts.get(true).isEmpty());
            }

            @Test
            void shouldHandleAllEvens() {
                Map<Boolean, List<Integer>> parts = Problem38.solve(List.of(2, 4));
                assertEquals(List.of(), parts.get(false));
            }
    }

    @Nested
    @DisplayName("Problem 39: Department with Maximum Employees")
    class Problem39Tests {

            @Test
            void shouldFindDepartmentWithMaxEmployees() {
                assertEquals(Optional.of(Department.ENGINEERING), Problem39.solve(TestDataFactory.sampleEmployees()));
            }

            @Test
            void shouldBreakTiesAlphabetically() {
                Employee e1 = new Employee(1, "A", 30, Department.SALES, 50_000, "X");
                Employee e2 = new Employee(2, "B", 31, Department.HR, 50_000, "Y");
                Employee e3 = new Employee(3, "C", 32, Department.SALES, 60_000, "Z");
                Employee e4 = new Employee(4, "D", 33, Department.HR, 60_000, "W");
                assertEquals(Optional.of(Department.HR), Problem39.solve(List.of(e1, e2, e3, e4)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem39.solve(List.of()));
            }

            @Test
            void shouldHandleSingleEmployee() {
                Employee e = TestDataFactory.sampleEmployees().get(0);
                assertEquals(Optional.of(e.getDepartment()), Problem39.solve(List.of(e)));
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(Optional.empty(), Problem39.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 40: Convert Employees to Map")
    class Problem40Tests {

            @Test
            void shouldConvertEmployeesToMapById() {
                List<Employee> employees = TestDataFactory.sampleEmployees();
                Map<Long, Employee> map = Problem40.solve(employees);
                assertEquals(10, map.size());
                assertEquals(employees.get(0), map.get(1L));
            }

            @Test
            void shouldKeepFirstOnDuplicateId() {
                Employee first = new Employee(1, "A", 30, Department.HR, 1, "X");
                Employee duplicate = new Employee(1, "B", 31, Department.HR, 2, "Y");
                Map<Long, Employee> map = Problem40.solve(List.of(first, duplicate));
                assertEquals("A", map.get(1L).getName());
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem40.solve(List.of()));
            }

            @Test
            void shouldPreserveInsertionOrder() {
                List<Employee> employees = TestDataFactory.sampleEmployees().subList(0, 3);
                assertEquals(List.copyOf(Problem40.solve(employees).keySet()), List.of(1L, 2L, 3L));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem40.solve(null));
            }
    }

}
