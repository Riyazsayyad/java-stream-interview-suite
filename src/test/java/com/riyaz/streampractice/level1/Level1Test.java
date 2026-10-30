package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem1;
import com.riyaz.streampractice.problems.level1.Problem2;
import com.riyaz.streampractice.problems.level1.Problem3;
import com.riyaz.streampractice.problems.level1.Problem4;
import com.riyaz.streampractice.problems.level1.Problem5;
import com.riyaz.streampractice.problems.level1.Problem6;
import com.riyaz.streampractice.problems.level1.Problem7;
import com.riyaz.streampractice.problems.level1.Problem8;
import com.riyaz.streampractice.problems.level1.Problem9;
import com.riyaz.streampractice.problems.level1.Problem10;

/** Candidate tests for level 1 (problems 1–10). */
class Level1Test {

    @Nested
    @DisplayName("Problem 1: Filter Even Numbers")
    class Problem1Tests {

            @Test
            void shouldFilterEvenNumbers() {
                assertEquals(List.of(-2, 4, 6), Problem1.solve(List.of(1, -2, 3, 4, 5, 6)));
            }

            @Test
            void shouldReturnEmptyForNoEvens() {
                assertEquals(List.of(), Problem1.solve(List.of(1, 3, 5)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem1.solve(List.of()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem1.solve(null));
            }

            @Test
            void shouldPreserveEncounterOrder() {
                assertEquals(List.of(8, 2, 4), Problem1.solve(List.of(8, 1, 2, 3, 4)));
            }
    }

    @Nested
    @DisplayName("Problem 2: Filter Odd Numbers")
    class Problem2Tests {

            @Test
            void shouldFilterOddNumbers() {
                assertEquals(List.of(1, 3, 5), Problem2.solve(List.of(1, 2, 3, 4, 5)));
            }

            @Test
            void shouldHandleEmptyCollection() {
                assertEquals(List.of(), Problem2.solve(List.of()));
            }

            @Test
            void shouldHandleNullCollection() {
                assertEquals(List.of(), Problem2.solve(null));
            }

            @Test
            void shouldHandleSingleOddElement() {
                assertEquals(List.of(7), Problem2.solve(List.of(7)));
            }

            @Test
            void shouldReturnEmptyWhenAllEven() {
                assertEquals(List.of(), Problem2.solve(List.of(2, 4, 6)));
            }
    }

    @Nested
    @DisplayName("Problem 3: Filter Numbers Greater Than Threshold")
    class Problem3Tests {

            @Test
            void shouldFilterGreaterThanThreshold() {
                assertEquals(List.of(10, 15), Problem3.solve(List.of(5, 10, 3, 15), 5));
            }

            @Test
            void shouldReturnEmptyWhenNoneGreater() {
                assertEquals(List.of(), Problem3.solve(List.of(1, 2, 3), 10));
            }

            @Test
            void shouldExcludeEqualToThreshold() {
                assertEquals(List.of(6), Problem3.solve(List.of(5, 6), 5));
            }

            @Test
            void shouldHandleEmptyInput() {
                assertEquals(List.of(), Problem3.solve(List.of(), 0));
            }

            @Test
            void shouldHandleNegativeThreshold() {
                assertEquals(List.of(0, 1), Problem3.solve(List.of(-1, 0, 1), -1));
            }
    }

    @Nested
    @DisplayName("Problem 4: Square Every Number")
    class Problem4Tests {

            @Test
            void shouldSquareNumbers() {
                assertEquals(List.of(1, 4, 9), Problem4.solve(List.of(1, 2, 3)));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem4.solve(List.of()));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem4.solve(null));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of(25), Problem4.solve(List.of(5)));
            }

            @Test
            void shouldSquareNegativeNumbers() {
                assertEquals(List.of(4, 9), Problem4.solve(List.of(-2, -3)));
            }
    }

    @Nested
    @DisplayName("Problem 5: Convert Strings to Uppercase")
    class Problem5Tests {

            @Test
            void shouldConvertToUppercase() {
                assertEquals(List.of("JAVA", "GO"), Problem5.solve(List.of("java", "go")));
            }

            @Test
            void shouldSkipNullElements() {
                assertEquals(List.of("A"), Problem5.solve(java.util.Arrays.asList(null, "a")));
            }

            @Test
            void shouldHandleEmptyString() {
                assertEquals(List.of(""), Problem5.solve(List.of("")));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem5.solve(List.of()));
            }

            @Test
            void shouldPreserveOrder() {
                assertEquals(List.of("A", "B", "C"), Problem5.solve(List.of("a", "b", "c")));
            }
    }

    @Nested
    @DisplayName("Problem 6: Convert Strings to Lowercase")
    class Problem6Tests {

            @Test
            void shouldConvertToLowercase() {
                assertEquals(List.of("java", "go"), Problem6.solve(List.of("JAVA", "GO")));
            }

            @Test
            void shouldPreserveNullElements() {
                assertEquals(java.util.Arrays.asList(null, "a"), Problem6.solve(java.util.Arrays.asList(null, "A")));
            }

            @Test
            void shouldHandleEmptyList() {
                assertEquals(List.of(), Problem6.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(List.of("sql"), Problem6.solve(List.of("SQL")));
            }

            @Test
            void shouldHandleNullList() {
                assertEquals(List.of(), Problem6.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 7: Count Elements")
    class Problem7Tests {

            @Test
            void shouldCountElements() {
                assertEquals(5, Problem7.solve(List.of(1, 2, 3, 4, 5)));
            }

            @Test
            void shouldReturnZeroForEmptyList() {
                assertEquals(0, Problem7.solve(List.of()));
            }

            @Test
            void shouldReturnZeroForNullList() {
                assertEquals(0, Problem7.solve(null));
            }

            @Test
            void shouldCountSingleElement() {
                assertEquals(1, Problem7.solve(List.of(42)));
            }

            @Test
            void shouldCountWithDuplicates() {
                assertEquals(4, Problem7.solve(List.of(1, 1, 2, 2)));
            }
    }

    @Nested
    @DisplayName("Problem 8: Find Maximum Number")
    class Problem8Tests {

            @Test
            void shouldFindMaximum() {
                assertEquals(OptionalInt.of(40), Problem8.solve(List.of(10, 40, 20)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(OptionalInt.empty(), Problem8.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(OptionalInt.of(7), Problem8.solve(List.of(7)));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(OptionalInt.of(-1), Problem8.solve(List.of(-5, -1, -3)));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(OptionalInt.empty(), Problem8.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 9: Find Minimum Number")
    class Problem9Tests {

            @Test
            void shouldFindMinimum() {
                assertEquals(OptionalInt.of(5), Problem9.solve(List.of(10, 5, 20)));
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(OptionalInt.empty(), Problem9.solve(List.of()));
            }

            @Test
            void shouldHandleSingleElement() {
                assertEquals(OptionalInt.of(3), Problem9.solve(List.of(3)));
            }

            @Test
            void shouldHandleNegativeNumbers() {
                assertEquals(OptionalInt.of(-10), Problem9.solve(List.of(-1, -10, -3)));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(OptionalInt.empty(), Problem9.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 10: Calculate Sum and Average")
    class Problem10Tests {

            @Test
            void shouldCalculateSumAndAverage() {
                Optional<SumAverageResult> result = Problem10.solve(List.of(1, 2, 3, 4));
                assertTrue(result.isPresent());
                assertEquals(10, result.get().getSum());
                assertEquals(2.5, result.get().getAverage());
            }

            @Test
            void shouldReturnEmptyForEmptyList() {
                assertEquals(Optional.empty(), Problem10.solve(List.of()));
            }

            @Test
            void shouldReturnEmptyForNullList() {
                assertEquals(Optional.empty(), Problem10.solve(null));
            }

            @Test
            void shouldHandleSingleElement() {
                Optional<SumAverageResult> result = Problem10.solve(List.of(5));
                assertEquals(5, result.get().getSum());
                assertEquals(5.0, result.get().getAverage());
            }

            @Test
            void shouldHandleNegativeValues() {
                Optional<SumAverageResult> result = Problem10.solve(List.of(-2, 2));
                assertEquals(0, result.get().getSum());
                assertEquals(0.0, result.get().getAverage());
            }
    }

}
