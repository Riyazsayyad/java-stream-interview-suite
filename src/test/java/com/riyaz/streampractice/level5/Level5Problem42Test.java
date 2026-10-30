package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem42;

class Level5Problem42Test {


    @Test
    void shouldExtractAllWords() {
        assertEquals(List.of("Java", "streams", "are", "powerful"),
                Problem42.solve(List.of("Java streams", "are powerful")));
    }

    @Test
    void shouldHandleEmptySentencesList() {
        assertEquals(List.of(), Problem42.solve(List.of()));
    }

    @Test
    void shouldSkipNullSentences() {
        assertEquals(List.of("a"), Problem42.solve(java.util.Arrays.asList(null, "a")));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem42.solve(null));
    }

    @Test
    void shouldTrimAndSplitMultipleSpaces() {
        assertEquals(List.of("a", "b"), Problem42.solve(List.of("  a   b  ")));
    }

}
