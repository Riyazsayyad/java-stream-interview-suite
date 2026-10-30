package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem45;

class Level5Problem45Test {


    @Test
    void shouldJoinWithDelimiter() {
        assertEquals("a,b,c", Problem45.solve(List.of("a", "b", "c"), ",", "", ""));
    }

    @Test
    void shouldJoinWithPrefixAndSuffix() {
        assertEquals("[a|b]", Problem45.solve(List.of("a", "b"), "|", "[", "]"));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals("()", Problem45.solve(List.of(), ",", "(", ")"));
    }

    @Test
    void shouldHandleSingleElement() {
        assertEquals("only", Problem45.solve(List.of("only"), ",", "", ""));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals("[]", Problem45.solve(null, ",", "[", "]"));
    }

}
