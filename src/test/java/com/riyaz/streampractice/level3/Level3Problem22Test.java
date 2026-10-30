package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level3.Problem22;

class Level3Problem22Test {


    @Test
    void shouldFindDuplicateNumbers() {
        assertEquals(List.of(2, 3), Problem22.solve(List.of(1, 2, 3, 2, 3)));
    }

    @Test
    void shouldReturnEmptyWhenNoDuplicates() {
        assertEquals(List.of(), Problem22.solve(List.of(1, 2, 3)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem22.solve(List.of()));
    }

    @Test
    void shouldReturnUniqueDuplicateValuesOnce() {
        assertEquals(List.of(4), Problem22.solve(List.of(4, 4, 4)));
    }

    @Test
    void shouldPreserveEncounterOrder() {
        assertEquals(List.of(1, 2), Problem22.solve(List.of(1, 2, 1, 2)));
    }

}
