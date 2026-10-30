package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem8;

class Level1Problem8Test {


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
