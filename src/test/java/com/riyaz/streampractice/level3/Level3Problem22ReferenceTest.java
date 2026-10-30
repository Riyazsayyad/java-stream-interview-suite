package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem22Reference;

class Level3Problem22ReferenceTest {


    @Test
    void shouldFindDuplicateNumbers() {
        assertEquals(List.of(2, 3), Problem22Reference.solve(List.of(1, 2, 3, 2, 3)));
    }

    @Test
    void shouldReturnEmptyWhenNoDuplicates() {
        assertEquals(List.of(), Problem22Reference.solve(List.of(1, 2, 3)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem22Reference.solve(List.of()));
    }

    @Test
    void shouldReturnUniqueDuplicateValuesOnce() {
        assertEquals(List.of(4), Problem22Reference.solve(List.of(4, 4, 4)));
    }

    @Test
    void shouldPreserveEncounterOrder() {
        assertEquals(List.of(1, 2), Problem22Reference.solve(List.of(1, 2, 1, 2)));
    }

}
