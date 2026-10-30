package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem19Reference;

class Level2Problem19ReferenceTest {


    @Test
    void shouldReverseString() {
        assertEquals("avaj", Problem19Reference.solve("java"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals("", Problem19Reference.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals("a", Problem19Reference.solve("a"));
    }

    @Test
    void shouldHandlePalindrome() {
        assertEquals("madam", Problem19Reference.solve("madam"));
    }

    @Test
    void shouldHandleNullAsEmpty() {
        assertEquals("", Problem19Reference.solve(null));
    }

}
