package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level1.Problem5;

class Level1Problem5Test {


    @Test
    void shouldConvertToUppercase() {
        assertEquals(List.of("JAVA", "GO"), Problem5.solve(List.of("java", "go")));
    }

    @Test
    void shouldSkipNullElements() {
        assertEquals(List.of("A"), Problem5.solve(java.util.Arrays.asList(null, "a")));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(""), Problem5.solve(List.of("")));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem5.solve(List.of()));
    }

    @Test
    void shouldPreserveOrder() {
        assertEquals(List.of("A", "B", "C"), Problem5.solve(List.of("a", "b", "c")));
    }

}
