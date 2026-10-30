package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level3.Problem21;
import com.riyaz.streampractice.problems.level3.Problem22;
import com.riyaz.streampractice.problems.level3.Problem23;
import com.riyaz.streampractice.problems.level3.Problem24;
import com.riyaz.streampractice.problems.level3.Problem25;
import com.riyaz.streampractice.problems.level3.Problem26;
import com.riyaz.streampractice.problems.level3.Problem27;
import com.riyaz.streampractice.problems.level3.Problem28;
import com.riyaz.streampractice.problems.level3.Problem29;
import com.riyaz.streampractice.problems.level3.Problem30;

/** Candidate tests for level 3 (problems 21–30). */
class Level3Test {

    @Nested
    @DisplayName("Problem 21: Remove Duplicate Numbers")
    class Problem21Tests {

            @Test
            void shouldRemoveDuplicatesPreservingOrder() {
                assertEquals(List.of(1, 2, 3), Problem21.solve(List.of(1, 2, 2, 3, 1)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem21.solve(List.of()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem21.solve(null));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of(9), Problem21.solve(List.of(9)));
            }

            @Test
            void shouldHandleAllDuplicates() {
                assertEquals(List.of(5), Problem21.solve(List.of(5, 5, 5)));
            }
    }

    @Nested
    @DisplayName("Problem 22: Find Duplicate Numbers")
    class Problem22Tests {

            @Test
            void shouldFindDuplicateNumbers() {
                assertEquals(List.of(2, 3), Problem22.solve(List.of(1, 2, 3, 2, 3)));
            }

            @Test
            void shouldReturnEmptyWhenNoDuplicates() {
                assertEquals(List.of(), Problem22.solve(List.of(1, 2, 3)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem22.solve(List.of()));
            }

            @Test
            void shouldReturnUniqueDuplicateValuesOnce() {
                assertEquals(List.of(4), Problem22.solve(List.of(4, 4, 4)));
            }

            @Test
            void shouldPreserveEncounterOrder() {
                assertEquals(List.of(1, 2), Problem22.solve(List.of(1, 2, 1, 2)));
            }
    }

    @Nested
    @DisplayName("Problem 23: Find Second-Highest Number")
    class Problem23Tests {

            @Test
            void shouldFindSecondHighestDistinct() {
                assertEquals(OptionalInt.of(30), Problem23.solve(List.of(10, 20, 30, 30, 40)));
            }

            @Test
            void shouldReturnEmptyWhenLessThanTwoDistinct() {
                assertEquals(OptionalInt.empty(), Problem23.solve(List.of(5, 5)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(OptionalInt.empty(), Problem23.solve(List.of()));
            }

            @Test
            void shouldHandleTwoDistinctValues() {
                assertEquals(OptionalInt.of(1), Problem23.solve(List.of(2, 1)));
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(OptionalInt.empty(), Problem23.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 24: Find Second-Lowest Number")
    class Problem24Tests {

            @Test
            void shouldFindSecondLowestDistinct() {
                assertEquals(OptionalInt.of(2), Problem24.solve(List.of(3, 1, 2, 2)));
            }

            @Test
            void shouldReturnEmptyWhenLessThanTwoDistinct() {
                assertEquals(OptionalInt.empty(), Problem24.solve(List.of(7)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(OptionalInt.empty(), Problem24.solve(List.of()));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(OptionalInt.of(-2), Problem24.solve(List.of(-3, -2, -1)));
            }

            @Test
            void shouldReturnEmptyForNull() {
                assertEquals(OptionalInt.empty(), Problem24.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 25: Sort Ascending")
    class Problem25Tests {

            @Test
            void shouldSortAscending() {
                assertEquals(List.of(1, 2, 3), Problem25.solve(List.of(3, 1, 2)));
            }

            @Test
            void shouldNotModifyOriginalOrderInAssertion() {
                List<Integer> input = new java.util.ArrayList<>(List.of(3, 1, 2));
                Problem25.solve(input);
                assertEquals(List.of(3, 1, 2), input);
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem25.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of(5), Problem25.solve(List.of(5)));
            }

            @Test
            void shouldHandleDuplicates() {
                assertEquals(List.of(1, 1, 2), Problem25.solve(List.of(2, 1, 1)));
            }
    }

    @Nested
    @DisplayName("Problem 26: Sort Descending")
    class Problem26Tests {

            @Test
            void shouldSortDescending() {
                assertEquals(List.of(3, 2, 1), Problem26.solve(List.of(1, 3, 2)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem26.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of(9), Problem26.solve(List.of(9)));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem26.solve(null));
            }

            @Test
            void shouldHandleDuplicates() {
                assertEquals(List.of(3, 2, 2, 1), Problem26.solve(List.of(1, 2, 3, 2)));
            }
    }

    @Nested
    @DisplayName("Problem 27: Calculate Total Sum")
    class Problem27Tests {

            @Test
            void shouldCalculateTotalSum() {
                assertEquals(15, Problem27.solve(List.of(1, 2, 3, 4, 5)));
            }

            @Test
            void shouldReturnZeroForEmptyList() {
                assertEquals(0, Problem27.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(42, Problem27.solve(List.of(42)));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(-1, Problem27.solve(List.of(-3, 2)));
            }

            @Test
            void shouldReturnZeroForNull() {
                assertEquals(0, Problem27.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 28: Calculate Average")
    class Problem28Tests {

            @Test
            void shouldCalculateAverage() {
                assertEquals(OptionalDouble.of(2.5), Problem28.solve(List.of(1, 2, 3, 4)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(OptionalDouble.empty(), Problem28.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(OptionalDouble.of(7.0), Problem28.solve(List.of(7)));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(OptionalDouble.empty(), Problem28.solve(null));
            }

            @Test
            void shouldHandleNegativeValues() {
                assertEquals(OptionalDouble.of(0.0), Problem28.solve(List.of(-2, 2)));
            }
    }

    @Nested
    @DisplayName("Problem 29: Top Three Highest Numbers")
    class Problem29Tests {

            @Test
            void shouldReturnTopThreeDistinctDescending() {
                assertEquals(List.of(40, 30, 20), Problem29.solve(List.of(10, 20, 30, 30, 40)));
            }

            @Test
            void shouldReturnAllWhenLessThanThreeDistinct() {
                assertEquals(List.of(2, 1), Problem29.solve(List.of(1, 2)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem29.solve(List.of()));
            }

            @Test
            void shouldHandleSingleDistinctValue() {
                assertEquals(List.of(5), Problem29.solve(List.of(5, 5)));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem29.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 30: Common Elements Between Two Lists")
    class Problem30Tests {

            @Test
            void shouldFindCommonDistinctElements() {
                assertEquals(List.of(2, 3), Problem30.solve(List.of(1, 2, 3, 4), List.of(3, 2, 5)));
            }

            @Test
            void shouldReturnEmptyWhenNoIntersection() {
                assertEquals(List.of(), Problem30.solve(List.of(1, 2), List.of(3, 4)));
            }

            @Test
            void shouldHandleEmptyFirstList() {
                assertEquals(List.of(), Problem30.solve(List.of(), List.of(1)));
            }

            @Test
            void shouldHandleNullLists() {
                assertEquals(List.of(), Problem30.solve(null, List.of(1)));
            }

            @Test
            void shouldPreserveOrderFromFirstList() {
                assertEquals(List.of(3, 1), Problem30.solve(List.of(3, 1, 2), List.of(1, 3)));
            }
    }

}
