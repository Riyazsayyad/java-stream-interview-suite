package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem3;

class Level1Problem3Test {


    @Test
    void shouldFilterGreaterThanThreshold() {
        assertEquals(List.of(10, 15), Problem3.solve(List.of(5, 10, 3, 15), 5));
    }

    @Test
    void shouldReturnEmptyWhenNoneGreater() {
        assertEquals(List.of(), Problem3.solve(List.of(1, 2, 3), 10));
    }

    @Test
    void shouldExcludeEqualToThreshold() {
        assertEquals(List.of(6), Problem3.solve(List.of(5, 6), 5));
    }

    @Test
    void shouldHandleEmptyInput() {
        assertEquals(List.of(), Problem3.solve(List.of(), 0));
    }

    @Test
    void shouldHandleNegativeThreshold() {
        assertEquals(List.of(0, 1), Problem3.solve(List.of(-1, 0, 1), -1));
    }

}
