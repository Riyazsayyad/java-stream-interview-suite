package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem18Reference;

class Level2Problem18ReferenceTest {


    @Test
    void shouldDetectAnagrams() {
        assertTrue(Problem18Reference.solve("listen", "silent"));
    }

    @Test
    void shouldRejectNonAnagrams() {
        assertFalse(Problem18Reference.solve("hello", "world"));
    }

    @Test
    void shouldIgnoreCaseAndWhitespace() {
        assertTrue(Problem18Reference.solve("Dormitory", "Dirty room"));
    }

    @Test
    void shouldHandleEmptyStrings() {
        assertTrue(Problem18Reference.solve("", ""));
    }

    @Test
    void shouldReturnFalseWhenNullProvided() {
        assertFalse(Problem18Reference.solve(null, "a"));
    }

}
