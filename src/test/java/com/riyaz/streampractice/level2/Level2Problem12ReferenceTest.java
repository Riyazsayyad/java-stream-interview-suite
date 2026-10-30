package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem12Reference;

class Level2Problem12ReferenceTest {


    @Test
    void shouldFindFirstRepeatingCharacter() {
        assertEquals(Optional.of('r'), Problem12Reference.solve("programming"));
    }

    @Test
    void shouldReturnEmptyWhenNoRepeats() {
        assertEquals(Optional.empty(), Problem12Reference.solve("abc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(Optional.empty(), Problem12Reference.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.empty(), Problem12Reference.solve("a"));
    }

    @Test
    void shouldDetectImmediateRepeat() {
        assertEquals(Optional.of('a'), Problem12Reference.solve("aab"));
    }

}
