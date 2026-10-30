package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem17Reference;

class Level2Problem17ReferenceTest {


    @Test
    void shouldFindLeastFrequentCharacter() {
        assertEquals(Optional.of('b'), Problem17Reference.solve("aaab"));
    }

    @Test
    void shouldBreakTiesByFirstEncounter() {
        assertEquals(Optional.of('a'), Problem17Reference.solve("aabbcc"));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('q'), Problem17Reference.solve("q"));
    }

    @Test
    void shouldReturnEmptyForEmptyString() {
        assertEquals(Optional.empty(), Problem17Reference.solve(""));
    }

    @Test
    void shouldWorkWithUniformFrequency() {
        assertEquals(Optional.of('a'), Problem17Reference.solve("abc"));
    }

}
