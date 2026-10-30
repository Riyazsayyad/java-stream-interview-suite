package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level5.Problem48Reference;

class Level5Problem48ReferenceTest {


    @Test
    void shouldReturnDuplicateCountsOnly() {
        Map<Integer, Long> dup = Problem48Reference.solve(List.of(1, 2, 2, 3, 3, 3));
        assertEquals(Map.of(2, 2L, 3, 3L), dup);
    }

    @Test
    void shouldReturnEmptyWhenNoDuplicates() {
        assertEquals(Map.of(), Problem48Reference.solve(List.of(1, 2, 3)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem48Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Map.of(), Problem48Reference.solve(List.of(5)));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem48Reference.solve(null));
    }

}
