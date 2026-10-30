package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem2Reference;

class Level1Problem2ReferenceTest {


    @Test
    void shouldFilterOddNumbers() {
        assertEquals(List.of(1, 3, 5), Problem2Reference.solve(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void shouldHandleEmptyCollection() {
        assertEquals(List.of(), Problem2Reference.solve(List.of()));
    }

    @Test
    void shouldHandleNullCollection() {
        assertEquals(List.of(), Problem2Reference.solve(null));
    }

    @Test
    void shouldHandleSingleOddElement() {
        assertEquals(List.of(7), Problem2Reference.solve(List.of(7)));
    }

    @Test
    void shouldReturnEmptyWhenAllEven() {
        assertEquals(List.of(), Problem2Reference.solve(List.of(2, 4, 6)));
    }

}
