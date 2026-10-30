package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem44;

class Level5Problem44Test {


    @Test
    void shouldFindShortestString() {
        assertEquals(Optional.of("go"), Problem44.solve(List.of("java", "go", "python")));
    }

    @Test
    void shouldBreakLengthTiesByFirstEncounter() {
        assertEquals(Optional.of("aa"), Problem44.solve(List.of("aa", "bb")));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem44.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Optional.of("z"), Problem44.solve(List.of("z")));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem44.solve(null));
    }

}
