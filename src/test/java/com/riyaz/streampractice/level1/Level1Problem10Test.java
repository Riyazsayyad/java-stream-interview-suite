package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem10;

class Level1Problem10Test {


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
