package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem15Reference;

class Level2Problem15ReferenceTest {


    @Test
    void shouldFindUniqueCharacters() {
        assertEquals(List.of('c'), Problem15Reference.solve("aabbc"));
    }

    @Test
    void shouldReturnAllWhenAllUnique() {
        assertEquals(List.of('a', 'b', 'c'), Problem15Reference.solve("abc"));
    }

    @Test
    void shouldReturnEmptyWhenAllRepeat() {
        assertEquals(List.of(), Problem15Reference.solve("aa"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(), Problem15Reference.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(List.of('z'), Problem15Reference.solve("z"));
    }

}
