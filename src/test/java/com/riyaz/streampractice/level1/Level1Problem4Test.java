package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem4;

class Level1Problem4Test {


    @Test
    void shouldSquareNumbers() {
        assertEquals(List.of(1, 4, 9), Problem4.solve(List.of(1, 2, 3)));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem4.solve(List.of()));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem4.solve(null));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(List.of(25), Problem4.solve(List.of(5)));
    }

    @Test
    void shouldSquareNegativeNumbers() {
        assertEquals(List.of(4, 9), Problem4.solve(List.of(-2, -3)));
    }

}
