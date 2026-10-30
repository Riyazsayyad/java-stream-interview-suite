package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem20Reference;

class Level2Problem20ReferenceTest {


    @Test
    void shouldFindFirstNonRepeatingWord() {
        assertEquals(Optional.of("great"), Problem20Reference.solve("java is great and java is powerful"));
    }

    @Test
    void shouldTreatWordsCaseInsensitively() {
        assertEquals(Optional.of("go"), Problem20Reference.solve("Java GO java"));
    }

    @Test
    void shouldReturnEmptyWhenAllWordsRepeat() {
        assertEquals(Optional.empty(), Problem20Reference.solve("a a b b"));
    }

    @Test
    void shouldHandleEmptySentence() {
        assertEquals(Optional.empty(), Problem20Reference.solve("   "));
    }

    @Test
    void shouldHandleSingleUniqueWord() {
        assertEquals(Optional.of("only"), Problem20Reference.solve("only"));
    }

}
