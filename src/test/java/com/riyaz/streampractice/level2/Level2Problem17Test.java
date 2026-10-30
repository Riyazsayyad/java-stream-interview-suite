package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem17;

class Level2Problem17Test {


    @Test
    void shouldFindLeastFrequentCharacter() {
        assertEquals(Optional.of('b'), Problem17.solve("aaab"));
    }

    @Test
    void shouldBreakTiesByFirstEncounter() {
        assertEquals(Optional.of('a'), Problem17.solve("aabbcc"));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('q'), Problem17.solve("q"));
    }

    @Test
    void shouldReturnEmptyForEmptyString() {
        assertEquals(Optional.empty(), Problem17.solve(""));
    }

    @Test
    void shouldWorkWithUniformFrequency() {
        assertEquals(Optional.of('a'), Problem17.solve("abc"));
    }

}
