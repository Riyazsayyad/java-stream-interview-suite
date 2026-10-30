package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem38Reference;

class Level4Problem38ReferenceTest {


    @Test
    void shouldPartitionEvenAndOdd() {
        Map<Boolean, List<Integer>> parts = Problem38Reference.solve(List.of(1, 2, 3, 4));
        assertEquals(List.of(2, 4), parts.get(true));
        assertEquals(List.of(1, 3), parts.get(false));
    }

    @Test
    void shouldHandleEmptyList() {
        Map<Boolean, List<Integer>> parts = Problem38Reference.solve(List.of());
        assertTrue(parts.get(true).isEmpty());
        assertTrue(parts.get(false).isEmpty());
    }

    @Test
    void shouldTreatZeroAsEven() {
        Map<Boolean, List<Integer>> parts = Problem38Reference.solve(List.of(0));
        assertEquals(List.of(0), parts.get(true));
    }

    @Test
    void shouldHandleNullList() {
        Map<Boolean, List<Integer>> parts = Problem38Reference.solve(null);
        assertTrue(parts.get(true).isEmpty());
    }

    @Test
    void shouldHandleAllEvens() {
        Map<Boolean, List<Integer>> parts = Problem38Reference.solve(List.of(2, 4));
        assertEquals(List.of(), parts.get(false));
    }

}
