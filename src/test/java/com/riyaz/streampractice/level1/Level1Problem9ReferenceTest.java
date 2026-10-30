package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem9Reference;

class Level1Problem9ReferenceTest {


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
