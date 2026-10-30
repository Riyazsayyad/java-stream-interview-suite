package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level4.Problem31Reference;

class Level4Problem31ReferenceTest {


    @Test
    void shouldBuildNumberFrequencyMap() {
        Map<Integer, Long> freq = Problem31Reference.solve(List.of(1, 2, 2, 3, 3, 3));
        assertEquals(1L, freq.get(1));
        assertEquals(2L, freq.get(2));
        assertEquals(3L, freq.get(3));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem31Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Map.of(7, 1L), Problem31Reference.solve(List.of(7)));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem31Reference.solve(null));
    }

    @Test
    void shouldCountNegativeNumbers() {
        assertEquals(Map.of(-1, 2L), Problem31Reference.solve(List.of(-1, -1)));
    }

}
