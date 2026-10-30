package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem1Reference;

class Level1Problem1ReferenceTest {


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
