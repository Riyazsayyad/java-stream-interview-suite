package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem16;

class Level2Problem16Test {


    @Test
    void shouldFindMostFrequentCharacter() {
        assertEquals(Optional.of('a'), Problem16.solve("banana"));
    }

    @Test
    void shouldBreakTiesByFirstEncounter() {
        assertEquals(Optional.of('a'), Problem16.solve("ab"));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('x'), Problem16.solve("x"));
    }

    @Test
    void shouldReturnEmptyForEmptyString() {
        assertEquals(Optional.empty(), Problem16.solve(""));
    }

    @Test
    void shouldPickFirstAmongEqualFrequencies() {
        assertEquals(Optional.of('s'), Problem16.solve("ssww"));
    }

}
