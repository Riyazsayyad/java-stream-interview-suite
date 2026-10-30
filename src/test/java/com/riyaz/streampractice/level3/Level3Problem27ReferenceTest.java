package com.riyaz.streampractice.level3;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level3.Problem27Reference;

class Level3Problem27ReferenceTest {


    @Test
    void shouldCalculateTotalSum() {
        assertEquals(15, Problem27Reference.solve(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void shouldReturnZeroForEmptyList() {
        assertEquals(0, Problem27Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(42, Problem27Reference.solve(List.of(42)));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(-1, Problem27Reference.solve(List.of(-3, 2)));
    }

    @Test
    void shouldReturnZeroForNull() {
        assertEquals(0, Problem27Reference.solve(null));
    }

}
