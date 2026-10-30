package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem26Reference;

class Level3Problem26ReferenceTest {


    @Test
    void shouldSortDescending() {
        assertEquals(List.of(3, 2, 1), Problem26Reference.solve(List.of(1, 3, 2)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem26Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(List.of(9), Problem26Reference.solve(List.of(9)));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem26Reference.solve(null));
    }

    @Test
    void shouldHandleDuplicates() {
        assertEquals(List.of(3, 2, 2, 1), Problem26Reference.solve(List.of(1, 2, 3, 2)));
    }

}
