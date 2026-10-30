package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem1Reference;
import com.riyaz.streampractice.reference.level1.Problem2Reference;
import com.riyaz.streampractice.reference.level1.Problem3Reference;
import com.riyaz.streampractice.reference.level1.Problem4Reference;
import com.riyaz.streampractice.reference.level1.Problem5Reference;
import com.riyaz.streampractice.reference.level1.Problem6Reference;
import com.riyaz.streampractice.reference.level1.Problem7Reference;
import com.riyaz.streampractice.reference.level1.Problem8Reference;
import com.riyaz.streampractice.reference.level1.Problem9Reference;
import com.riyaz.streampractice.reference.level1.Problem10Reference;

/** Reference solution tests for level 1. */
class Level1ReferenceTest {

    @Nested
    @DisplayName("Problem 1: Filter Even Numbers")
    class Problem1Tests {

            @Test
            void shouldFilterEvenNumbers() {
                assertEquals(List.of(-2, 4, 6), Problem1Reference.solve(List.of(1, -2, 3, 4, 5, 6)));
            }

            @Test
            void shouldReturnEmptyForNoEvens() {
                assertEquals(List.of(), Problem1Reference.solve(List.of(1, 3, 5)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem1Reference.solve(List.of()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem1Reference.solve(null));
            }

            @Test
            void shouldPreserveEncounterOrder() {
                assertEquals(List.of(8, 2, 4), Problem1Reference.solve(List.of(8, 1, 2, 3, 4)));
            }
    }

    @Nested
    @DisplayName("Problem 2: Filter Odd Numbers")
    class Problem2Tests {

            @Test
            void shouldFilterOddNumbers() {
                assertEquals(List.of(1, 3, 5), Problem2Reference.solve(List.of(1, 2, 3, 4, 5)));
            }

            @Test
            void shouldHandleEmptyCollection() {
                assertEquals(List.of(), Problem2Reference.solve(List.of()));
            }

            @Test
            void shouldHandleNullCollection() {
                assertEquals(List.of(), Problem2Reference.solve(null));
            }

            @Test
            void shouldHandleSingleOddElement() {
                assertEquals(List.of(7), Problem2Reference.solve(List.of(7)));
            }

            @Test
            void shouldReturnEmptyWhenAllEven() {
                assertEquals(List.of(), Problem2Reference.solve(List.of(2, 4, 6)));
            }
    }

    @Nested
    @DisplayName("Problem 3: Filter Numbers Greater Than Threshold")
    class Problem3Tests {

            @Test
            void shouldFilterGreaterThanThreshold() {
                assertEquals(List.of(10, 15), Problem3Reference.solve(List.of(5, 10, 3, 15), 5));
            }

            @Test
            void shouldReturnEmptyWhenNoneGreater() {
                assertEquals(List.of(), Problem3Reference.solve(List.of(1, 2, 3), 10));
            }

            @Test
            void shouldExcludeEqualToThreshold() {
                assertEquals(List.of(6), Problem3Reference.solve(List.of(5, 6), 5));
            }

            @Test
            void shouldHandleEmptyInput() {
                assertEquals(List.of(), Problem3Reference.solve(List.of(), 0));
            }

            @Test
            void shouldHandleNegativeThreshold() {
                assertEquals(List.of(0, 1), Problem3Reference.solve(List.of(-1, 0, 1), -1));
            }
    }

    @Nested
    @DisplayName("Problem 4: Square Every Number")
    class Problem4Tests {

            @Test
            void shouldSquareNumbers() {
                assertEquals(List.of(1, 4, 9), Problem4Reference.solve(List.of(1, 2, 3)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem4Reference.solve(List.of()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem4Reference.solve(null));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of(25), Problem4Reference.solve(List.of(5)));
            }

            @Test
            void shouldSquareNegativeNumbers() {
                assertEquals(List.of(4, 9), Problem4Reference.solve(List.of(-2, -3)));
            }
    }

    @Nested
    @DisplayName("Problem 5: Convert Strings to Uppercase")
    class Problem5Tests {

            @Test
            void shouldConvertToUppercase() {
                assertEquals(List.of("JAVA", "GO"), Problem5Reference.solve(List.of("java", "go")));
            }

            @Test
            void shouldSkipNullElements() {
                assertEquals(List.of("A"), Problem5Reference.solve(java.util.Arrays.asList(null, "a")));
            }

            @Test
            void shouldHandleEmptyString() {
                assertEquals(List.of(""), Problem5Reference.solve(List.of("")));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem5Reference.solve(List.of()));
            }

            @Test
            void shouldPreserveOrder() {
                assertEquals(List.of("A", "B", "C"), Problem5Reference.solve(List.of("a", "b", "c")));
            }
    }

    @Nested
    @DisplayName("Problem 6: Convert Strings to Lowercase")
    class Problem6Tests {

            @Test
            void shouldConvertToLowercase() {
                assertEquals(List.of("java", "go"), Problem6Reference.solve(List.of("JAVA", "GO")));
            }

            @Test
            void shouldPreserveNullElements() {
                assertEquals(java.util.Arrays.asList(null, "a"), Problem6Reference.solve(java.util.Arrays.asList(null, "A")));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem6Reference.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of("sql"), Problem6Reference.solve(List.of("SQL")));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem6Reference.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 7: Count Elements")
    class Problem7Tests {

            @Test
            void shouldCountElements() {
                assertEquals(5, Problem7Reference.solve(List.of(1, 2, 3, 4, 5)));
            }

            @Test
            void shouldReturnZeroForEmptyList() {
                assertEquals(0, Problem7Reference.solve(List.of()));
            }

            @Test
            void shouldReturnZeroForNullList() {
                assertEquals(0, Problem7Reference.solve(null));
            }

            @Test
            void shouldCountSingleElement() {
                assertEquals(1, Problem7Reference.solve(List.of(42)));
            }

            @Test
            void shouldCountWithDuplicates() {
                assertEquals(4, Problem7Reference.solve(List.of(1, 1, 2, 2)));
            }
    }

    @Nested
    @DisplayName("Problem 8: Find Maximum Number")
    class Problem8Tests {

            @Test
            void shouldFindMaximum() {
                assertEquals(OptionalInt.of(40), Problem8Reference.solve(List.of(10, 40, 20)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(OptionalInt.empty(), Problem8Reference.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(OptionalInt.of(7), Problem8Reference.solve(List.of(7)));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(OptionalInt.of(-1), Problem8Reference.solve(List.of(-5, -1, -3)));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(OptionalInt.empty(), Problem8Reference.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 9: Find Minimum Number")
    class Problem9Tests {

            @Test
            void shouldFindMinimum() {
                assertEquals(OptionalInt.of(5), Problem9Reference.solve(List.of(10, 5, 20)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(OptionalInt.empty(), Problem9Reference.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(OptionalInt.of(3), Problem9Reference.solve(List.of(3)));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(OptionalInt.of(-10), Problem9Reference.solve(List.of(-1, -10, -3)));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(OptionalInt.empty(), Problem9Reference.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 10: Calculate Sum and Average")
    class Problem10Tests {

            @Test
            void shouldCalculateSumAndAverage() {
                Optional<SumAverageResult> result = Problem10Reference.solve(List.of(1, 2, 3, 4));
                assertTrue(result.isPresent());
                assertEquals(10, result.get().getSum());
                assertEquals(2.5, result.get().getAverage());
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem10Reference.solve(List.of()));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(Optional.empty(), Problem10Reference.solve(null));
            }

            @Test
            void shouldHandleSingleElement() {
                Optional<SumAverageResult> result = Problem10Reference.solve(List.of(5));
                assertEquals(5, result.get().getSum());
                assertEquals(5.0, result.get().getAverage());
            }

            @Test
            void shouldHandleNegativeValues() {
                Optional<SumAverageResult> result = Problem10Reference.solve(List.of(-2, 2));
                assertEquals(0, result.get().getSum());
                assertEquals(0.0, result.get().getAverage());
            }
    }

}
