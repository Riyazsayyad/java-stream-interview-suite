package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem12;

class Level2Problem12Test {


    @Test
    void shouldFindFirstRepeatingCharacter() {
        assertEquals(Optional.of('r'), Problem12.solve("programming"));
    }

    @Test
    void shouldReturnEmptyWhenNoRepeats() {
        assertEquals(Optional.empty(), Problem12.solve("abc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(Optional.empty(), Problem12.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.empty(), Problem12.solve("a"));
    }

    @Test
    void shouldDetectImmediateRepeat() {
        assertEquals(Optional.of('a'), Problem12.solve("aab"));
    }

}
