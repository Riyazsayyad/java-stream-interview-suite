package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem18;

class Level2Problem18Test {


    @Test
    void shouldDetectAnagrams() {
        assertTrue(Problem18.solve("listen", "silent"));
    }

    @Test
    void shouldRejectNonAnagrams() {
        assertFalse(Problem18.solve("hello", "world"));
    }

    @Test
    void shouldIgnoreCaseAndWhitespace() {
        assertTrue(Problem18.solve("Dormitory", "Dirty room"));
    }

    @Test
    void shouldHandleEmptyStrings() {
        assertTrue(Problem18.solve("", ""));
    }

    @Test
    void shouldReturnFalseWhenNullProvided() {
        assertFalse(Problem18.solve(null, "a"));
    }

}
