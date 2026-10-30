package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem6Reference;

class Level1Problem6ReferenceTest {


    @Test
    void shouldConvertToLowercase() {
        assertEquals(List.of("java", "go"), Problem6Reference.solve(List.of("JAVA", "GO")));
    }

    @Test
    void shouldPreserveNullElements() {
        assertEquals(java.util.Arrays.asList(null, "a"), Problem6Reference.solve(java.util.Arrays.asList(null, "A")));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem6Reference.solve(List.of()));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals(List.of("sql"), Problem6Reference.solve(List.of("SQL")));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(List.of(), Problem6Reference.solve(null));
    }

}
