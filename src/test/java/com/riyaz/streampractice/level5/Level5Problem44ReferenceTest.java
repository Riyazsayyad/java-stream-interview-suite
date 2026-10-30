package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level5.Problem44Reference;

class Level5Problem44ReferenceTest {


    @Test
    void shouldFindShortestString() {
        assertEquals(Optional.of("go"), Problem44Reference.solve(List.of("java", "go", "python")));
    }

    @Test
    void shouldBreakLengthTiesByFirstEncounter() {
        assertEquals(Optional.of("aa"), Problem44Reference.solve(List.of("aa", "bb")));
    }

    @Test
    void shouldReturnEmptyForEmptyList() {
        assertEquals(Optional.empty(), Problem44Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(Optional.of("z"), Problem44Reference.solve(List.of("z")));
    }

    @Test
    void shouldReturnEmptyForNull() {
        assertEquals(Optional.empty(), Problem44Reference.solve(null));
    }

}
