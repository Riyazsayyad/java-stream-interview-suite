package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem43;

class Level5Problem43Test {


    @Test
    void shouldFindLongestString() {
        assertEquals(Optional.of("python"), Problem43.solve(List.of("java", "go", "python")));
    }

    @Test
    void shouldBreakLengthTiesByFirstEncounter() {
        assertEquals(Optional.of("aa"), Problem43.solve(List.of("aa", "bb")));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem43.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Optional.of("x"), Problem43.solve(List.of("x")));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem43.solve(null));
    }

}
