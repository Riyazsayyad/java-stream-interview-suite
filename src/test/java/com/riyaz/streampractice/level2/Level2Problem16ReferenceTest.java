package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem16Reference;

class Level2Problem16ReferenceTest {


    @Test
    void shouldFindMostFrequentCharacter() {
        assertEquals(Optional.of('a'), Problem16Reference.solve("banana"));
    }

    @Test
    void shouldBreakTiesByFirstEncounter() {
        assertEquals(Optional.of('a'), Problem16Reference.solve("ab"));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('x'), Problem16Reference.solve("x"));
    }

    @Test
    void shouldReturnEmptyForEmptyString() {
        assertEquals(Optional.empty(), Problem16Reference.solve(""));
    }

    @Test
    void shouldPickFirstAmongEqualFrequencies() {
        assertEquals(Optional.of('s'), Problem16Reference.solve("ssww"));
    }

}
