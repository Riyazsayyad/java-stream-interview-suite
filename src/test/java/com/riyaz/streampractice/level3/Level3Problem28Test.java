package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level3.Problem28;

class Level3Problem28Test {


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
