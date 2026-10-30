package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem19;

class Level2Problem19Test {


    @Test
    void shouldReverseString() {
        assertEquals("avaj", Problem19.solve("java"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals("", Problem19.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals("a", Problem19.solve("a"));
    }

    @Test
    void shouldHandlePalindrome() {
        assertEquals("madam", Problem19.solve("madam"));
    }

    @Test
    void shouldHandleNullAsEmpty() {
        assertEquals("", Problem19.solve(null));
    }

}
