package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem7;

class Level1Problem7Test {


    @Test
    void shouldCountElements() {
        assertEquals(5, Problem7.solve(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void shouldReturnZeroForEmptyList() {
        assertEquals(0, Problem7.solve(List.of()));
    }

    @Test
    void shouldReturnZeroForNullList() {
        assertEquals(0, Problem7.solve(null));
    }

    @Test
    void shouldCountSingleElement() {
        assertEquals(1, Problem7.solve(List.of(42)));
    }

    @Test
    void shouldCountWithDuplicates() {
        assertEquals(4, Problem7.solve(List.of(1, 1, 2, 2)));
    }

}
