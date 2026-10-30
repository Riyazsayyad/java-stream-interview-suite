package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem41;
import com.riyaz.streampractice.problems.level5.Problem42;
import com.riyaz.streampractice.problems.level5.Problem43;
import com.riyaz.streampractice.problems.level5.Problem44;
import com.riyaz.streampractice.problems.level5.Problem45;
import com.riyaz.streampractice.problems.level5.Problem46;
import com.riyaz.streampractice.problems.level5.Problem47;
import com.riyaz.streampractice.problems.level5.Problem48;
import com.riyaz.streampractice.problems.level5.Problem49;
import com.riyaz.streampractice.problems.level5.Problem50;

/** Candidate tests for level 5 (problems 41–50). */
class Level5Test {

    @Nested
    @DisplayName("Problem 41: Flatten List of Lists")
    class Problem41Tests {

            @Test
            void shouldFlattenNestedLists() {
                assertEquals(List.of(1, 2, 3, 4), Problem41.solve(List.of(List.of(1, 2), List.of(3, 4))));
            }

            @Test
            void shouldHandleEmptyOuterList() {
                assertEquals(List.of(), Problem41.solve(List.of()));
            }

            @Test
            void shouldHandleEmptyInnerLists() {
                assertEquals(List.of(), Problem41.solve(List.of(List.of(), List.of())));
            }

            @Test
            void shouldHandleNullOuterList() {
                assertEquals(List.of(), Problem41.solve(null));
            }

            @Test
            void shouldPreserveOrder() {
                assertEquals(List.of(1, 2, 3), Problem41.solve(List.of(List.of(1), List.of(2, 3))));
            }
    }

    @Nested
    @DisplayName("Problem 42: Extract Words from Sentences")
    class Problem42Tests {

            @Test
            void shouldExtractAllWords() {
                assertEquals(List.of("Java", "streams", "are", "powerful"),
                        Problem42.solve(List.of("Java streams", "are powerful")));
            }

            @Test
            void shouldHandleEmptySentencesList() {
                assertEquals(List.of(), Problem42.solve(List.of()));
            }

            @Test
            void shouldSkipNullSentences() {
                assertEquals(List.of("a"), Problem42.solve(java.util.Arrays.asList(null, "a")));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem42.solve(null));
            }

            @Test
            void shouldTrimAndSplitMultipleSpaces() {
                assertEquals(List.of("a", "b"), Problem42.solve(List.of("  a   b  ")));
            }
    }

    @Nested
    @DisplayName("Problem 43: Find Longest String")
    class Problem43Tests {

            @Test
            void shouldFindLongestString() {
                assertEquals(Optional.of("python"), Problem43.solve(List.of("java", "go", "python")));
            }

            @Test
            void shouldBreakLengthTiesByFirstEncounter() {
                assertEquals(Optional.of("aa"), Problem43.solve(List.of("aa", "bb")));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem43.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(Optional.of("x"), Problem43.solve(List.of("x")));
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(Optional.empty(), Problem43.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 44: Find Shortest String")
    class Problem44Tests {

            @Test
            void shouldFindShortestString() {
                assertEquals(Optional.of("go"), Problem44.solve(List.of("java", "go", "python")));
            }

            @Test
            void shouldBreakLengthTiesByFirstEncounter() {
                assertEquals(Optional.of("aa"), Problem44.solve(List.of("aa", "bb")));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem44.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(Optional.of("z"), Problem44.solve(List.of("z")));
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(Optional.empty(), Problem44.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 45: Join Strings")
    class Problem45Tests {

            @Test
            void shouldJoinWithDelimiter() {
                assertEquals("a,b,c", Problem45.solve(List.of("a", "b", "c"), ",", "", ""));
            }

            @Test
            void shouldJoinWithPrefixAndSuffix() {
                assertEquals("[a|b]", Problem45.solve(List.of("a", "b"), "|", "[", "]"));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals("()", Problem45.solve(List.of(), ",", "(", ")"));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals("only", Problem45.solve(List.of("only"), ",", "", ""));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals("[]", Problem45.solve(null, ",", "[", "]"));
            }
    }

    @Nested
    @DisplayName("Problem 46: Total Salary by Department")
    class Problem46Tests {

            @Test
            void shouldCalculateTotalSalaryByDepartment() {
                Map<Department, Double> totals = Problem46.solve(TestDataFactory.sampleEmployees());
                assertEquals(350_000.0, totals.get(Department.ENGINEERING));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem46.solve(List.of()));
            }

            @Test
            void shouldHandleSingleEmployee() {
                Employee e = TestDataFactory.sampleEmployees().get(0);
                assertEquals(e.getSalary(), Problem46.solve(List.of(e)).get(e.getDepartment()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem46.solve(null));
            }

            @Test
            void shouldSumMultipleInSameDepartment() {
                Map<Department, Double> totals = Problem46.solve(TestDataFactory.sampleEmployees());
                assertTrue(totals.get(Department.SALES) > 0);
            }
    }

    @Nested
    @DisplayName("Problem 47: Top Three Highest-Paid Per Department")
    class Problem47Tests {

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

    @Nested
    @DisplayName("Problem 48: Duplicate Elements with Counts")
    class Problem48Tests {

            @Test
            void shouldReturnDuplicateCountsOnly() {
                Map<Integer, Long> dup = Problem48.solve(List.of(1, 2, 2, 3, 3, 3));
                assertEquals(Map.of(2, 2L, 3, 3L), dup);
            }

            @Test
            void shouldReturnEmptyWhenNoDuplicates() {
                assertEquals(Map.of(), Problem48.solve(List.of(1, 2, 3)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem48.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(Map.of(), Problem48.solve(List.of(5)));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem48.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 49: Transaction Aggregation by User")
    class Problem49Tests {

            @Test
            void shouldAggregateSuccessfulTransactionsByUser() {
                Map<String, Double> totals = Problem49.solve(TestDataFactory.sampleTransactions());
                assertEquals(150.0, totals.get("u1"));
                assertEquals(230.0, totals.get("u2"));
                assertEquals(40.0, totals.get("u3"));
            }

            @Test
            void shouldIgnoreFailedTransactions() {
                Transaction failed = new Transaction("x", "u9", 999, Transaction.TransactionType.CREDIT, Transaction.Status.FAILED);
                assertFalse(Problem49.solve(List.of(failed)).containsKey("u9"));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(Map.of(), Problem49.solve(List.of()));
            }

            @Test
            void shouldHandleSingleSuccessfulTransaction() {
                Transaction t = new Transaction("a", "u1", 10, Transaction.TransactionType.CREDIT, Transaction.Status.SUCCESS);
                assertEquals(10.0, Problem49.solve(List.of(t)).get("u1"));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(Map.of(), Problem49.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 50: Advanced Employee Analytics")
    class Problem50Tests {

            @Test
            void shouldBuildAdvancedEmployeeAnalyticsReport() {
                EmployeeAnalyticsReport report = Problem50.solve(TestDataFactory.sampleEmployees(), 100_000);
                assertEquals(6, report.getHighestPaidByDepartment().size());
                assertTrue(report.getAverageSalaryByDepartment().containsKey(Department.FINANCE));
                assertEquals(3L, report.getEmployeeCountByDepartment().get(Department.ENGINEERING));
                assertFalse(report.getDepartmentsAboveAverageThreshold().isEmpty());
                assertEquals(3, report.getTopThreeHighestPaidOrganizationWide().size());
            }

            @Test
            void shouldReturnEmptyReportForEmptyEmployees() {
                EmployeeAnalyticsReport report = Problem50.solve(List.of(), 1);
                assertTrue(report.getHighestPaidByDepartment().isEmpty());
                assertTrue(report.getTopThreeHighestPaidOrganizationWide().isEmpty());
            }

            @Test
            void shouldFilterDepartmentsAboveThreshold() {
                EmployeeAnalyticsReport report = Problem50.solve(TestDataFactory.sampleEmployees(), 200_000);
                assertTrue(report.getDepartmentsAboveAverageThreshold().isEmpty());
            }

            @Test
            void shouldHandleSingleEmployee() {
                Employee e = TestDataFactory.sampleEmployees().get(0);
                EmployeeAnalyticsReport report = Problem50.solve(List.of(e), 0);
                assertEquals(1, report.getTopThreeHighestPaidOrganizationWide().size());
            }

            @Test
            void shouldHandleNullEmployeesAsEmptyReport() {
                EmployeeAnalyticsReport report = Problem50.solve(null, 100_000);
                assertTrue(report.getEmployeeCountByDepartment().isEmpty());
            }
    }

}
