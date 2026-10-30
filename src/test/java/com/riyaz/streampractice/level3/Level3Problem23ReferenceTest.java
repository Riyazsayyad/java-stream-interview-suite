package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem23Reference;

class Level3Problem23ReferenceTest {


    @Test
    void shouldFindSecondHighestDistinct() {
        assertEquals(OptionalInt.of(30), Problem23Reference.solve(List.of(10, 20, 30, 30, 40)));
    }

    @Test
    void shouldReturnEmptyWhenLessThanTwoDistinct() {
        assertEquals(OptionalInt.empty(), Problem23Reference.solve(List.of(5, 5)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(OptionalInt.empty(), Problem23Reference.solve(List.of()));
    }

    @Test
    void shouldHandleTwoDistinctValues() {
        assertEquals(OptionalInt.of(1), Problem23Reference.solve(List.of(2, 1)));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(OptionalInt.empty(), Problem23Reference.solve(null));
    }

}
