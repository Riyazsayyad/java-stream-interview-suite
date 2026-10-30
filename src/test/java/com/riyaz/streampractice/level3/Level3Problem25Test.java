package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level3.Problem25;

class Level3Problem25Test {


    @Test
    void shouldSortAscending() {
        assertEquals(List.of(1, 2, 3), Problem25.solve(List.of(3, 1, 2)));
    }

    @Test
    void shouldNotModifyOriginalOrderInAssertion() {
        List<Integer> input = new java.util.ArrayList<>(List.of(3, 1, 2));
        Problem25.solve(input);
        assertEquals(List.of(3, 1, 2), input);
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem25.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(List.of(5), Problem25.solve(List.of(5)));
    }

    @Test
    void shouldHandleDuplicates() {
        assertEquals(List.of(1, 1, 2), Problem25.solve(List.of(2, 1, 1)));
    }

}
