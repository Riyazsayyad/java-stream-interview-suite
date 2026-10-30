package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem30Reference;

class Level3Problem30ReferenceTest {


    @Test
    void shouldFindCommonDistinctElements() {
        assertEquals(List.of(2, 3), Problem30Reference.solve(List.of(1, 2, 3, 4), List.of(3, 2, 5)));
    }

    @Test
    void shouldReturnEmptyWhenNoIntersection() {
        assertEquals(List.of(), Problem30Reference.solve(List.of(1, 2), List.of(3, 4)));
    }

    @Test
    void shouldHandleEmptyFirstList() {
        assertEquals(List.of(), Problem30Reference.solve(List.of(), List.of(1)));
    }

    @Test
    void shouldHandleNullLists() {
        assertEquals(List.of(), Problem30Reference.solve(null, List.of(1)));
    }

    @Test
    void shouldPreserveOrderFromFirstList() {
        assertEquals(List.of(3, 1), Problem30Reference.solve(List.of(3, 1, 2), List.of(1, 3)));
    }

}
