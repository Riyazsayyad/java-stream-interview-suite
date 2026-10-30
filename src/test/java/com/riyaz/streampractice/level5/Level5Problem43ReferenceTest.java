package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level5.Problem43Reference;

class Level5Problem43ReferenceTest {


    @Test
    void shouldFindLongestString() {
        assertEquals(Optional.of("python"), Problem43Reference.solve(List.of("java", "go", "python")));
    }

    @Test
    void shouldBreakLengthTiesByFirstEncounter() {
        assertEquals(Optional.of("aa"), Problem43Reference.solve(List.of("aa", "bb")));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem43Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Optional.of("x"), Problem43Reference.solve(List.of("x")));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem43Reference.solve(null));
    }

}
