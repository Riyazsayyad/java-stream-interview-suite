package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level3.Problem29;

class Level3Problem29Test {


    @Test
    void shouldReturnTopThreeDistinctDescending() {
        assertEquals(List.of(40, 30, 20), Problem29.solve(List.of(10, 20, 30, 30, 40)));
    }

    @Test
    void shouldReturnAllWhenLessThanThreeDistinct() {
        assertEquals(List.of(2, 1), Problem29.solve(List.of(1, 2)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem29.solve(List.of()));
    }

    @Test
    void shouldHandleSingleDistinctValue() {
        assertEquals(List.of(5), Problem29.solve(List.of(5, 5)));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem29.solve(null));
    }

}
