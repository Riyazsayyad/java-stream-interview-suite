package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem13Reference;

class Level2Problem13ReferenceTest {


    @Test
    void shouldCountCharacterFrequency() {
        Map<Character, Long> freq = Problem13Reference.solve("banana");
        assertEquals(1L, freq.get('b'));
        assertEquals(3L, freq.get('a'));
        assertEquals(2L, freq.get('n'));
    }

    @Test
    void shouldReturnEmptyMapForEmptyString() {
        assertEquals(Map.of(), Problem13Reference.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Map.of('x', 1L), Problem13Reference.solve("x"));
    }

    @Test
    void shouldPreserveInsertionOrder() {
        Map<Character, Long> freq = Problem13Reference.solve("abca");
        assertEquals(List.of('a', 'b', 'c'), List.copyOf(freq.keySet()));
    }

    @Test
    void shouldHandleNullAsEmpty() {
        assertEquals(Map.of(), Problem13Reference.solve(null));
    }

}
