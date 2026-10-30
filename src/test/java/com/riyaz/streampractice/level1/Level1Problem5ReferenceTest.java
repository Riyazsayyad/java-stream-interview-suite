package com.riyaz.streampractice.level1;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level1.Problem5Reference;

class Level1Problem5ReferenceTest {


    @Test
    void shouldConvertToUppercase() {
        assertEquals(List.of("JAVA", "GO"), Problem5Reference.solve(List.of("java", "go")));
    }

    @Test
    void shouldSkipNullElements() {
        assertEquals(List.of("A"), Problem5Reference.solve(java.util.Arrays.asList(null, "a")));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(""), Problem5Reference.solve(List.of("")));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(List.of(), Problem5Reference.solve(List.of()));
    }

    @Test
    void shouldPreserveOrder() {
        assertEquals(List.of("A", "B", "C"), Problem5Reference.solve(List.of("a", "b", "c")));
    }

}
