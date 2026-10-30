package com.riyaz.streampractice.level4;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level4.Problem32;

class Level4Problem32Test {


    @Test
    void shouldGroupStringsByLength() {
        Map<Integer, List<String>> grouped = Problem32.solve(List.of("java", "go", "python", "sql"));
        assertEquals(List.of("go"), grouped.get(2));
        assertEquals(List.of("sql"), grouped.get(3));
        assertTrue(grouped.get(4).containsAll(List.of("java")));
        assertTrue(grouped.get(6).contains("python"));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem32.solve(List.of()));
    }

    @Test
    void shouldHandleSingleString() {
        assertEquals(Map.of(3, List.of("api")), Problem32.solve(List.of("api")));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem32.solve(null));
    }

    @Test
    void shouldGroupDuplicatesSameLength() {
        Map<Integer, List<String>> grouped = Problem32.solve(List.of("aa", "bb"));
        assertEquals(2, grouped.get(2).size());
    }

}
