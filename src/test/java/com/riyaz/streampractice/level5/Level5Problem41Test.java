package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem41;

class Level5Problem41Test {


    @Test
    void shouldFlattenNestedLists() {
        assertEquals(List.of(1, 2, 3, 4), Problem41.solve(List.of(List.of(1, 2), List.of(3, 4))));
    }

    @Test
    void shouldHandleEmptyOuterList() {
        assertEquals(List.of(), Problem41.solve(List.of()));
    }

    @Test
    void shouldHandleEmptyInnerLists() {
        assertEquals(List.of(), Problem41.solve(List.of(List.of(), List.of())));
    }

    @Test
    void shouldHandleNullOuterList() {
        assertEquals(List.of(), Problem41.solve(null));
    }

    @Test
    void shouldPreserveOrder() {
        assertEquals(List.of(1, 2, 3), Problem41.solve(List.of(List.of(1), List.of(2, 3))));
    }

}
