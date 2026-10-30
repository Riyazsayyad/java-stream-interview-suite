package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem24Reference;

class Level3Problem24ReferenceTest {


    @Test
    void shouldFindSecondLowestDistinct() {
        assertEquals(OptionalInt.of(2), Problem24Reference.solve(List.of(3, 1, 2, 2)));
    }

    @Test
    void shouldReturnEmptyWhenLessThanTwoDistinct() {
        assertEquals(OptionalInt.empty(), Problem24Reference.solve(List.of(7)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(OptionalInt.empty(), Problem24Reference.solve(List.of()));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(OptionalInt.of(-2), Problem24Reference.solve(List.of(-3, -2, -1)));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(OptionalInt.empty(), Problem24Reference.solve(null));
    }

}
