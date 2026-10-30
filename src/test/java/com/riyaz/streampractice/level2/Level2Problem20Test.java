package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem20;

class Level2Problem20Test {


    @Test
    void shouldFindFirstNonRepeatingWord() {
        assertEquals(Optional.of("great"), Problem20.solve("java is great and java is powerful"));
    }

    @Test
    void shouldTreatWordsCaseInsensitively() {
        assertEquals(Optional.of("go"), Problem20.solve("Java GO java"));
    }

    @Test
    void shouldReturnEmptyWhenAllWordsRepeat() {
        assertEquals(Optional.empty(), Problem20.solve("a a b b"));
    }

    @Test
    void shouldHandleEmptySentence() {
        assertEquals(Optional.empty(), Problem20.solve("   "));
    }

    @Test
    void shouldHandleSingleUniqueWord() {
        assertEquals(Optional.of("only"), Problem20.solve("only"));
    }

}
