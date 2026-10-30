package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem15;

class Level2Problem15Test {


    @Test
    void shouldFindUniqueCharacters() {
        assertEquals(List.of('c'), Problem15.solve("aabbc"));
    }

    @Test
    void shouldReturnAllWhenAllUnique() {
        assertEquals(List.of('a', 'b', 'c'), Problem15.solve("abc"));
    }

    @Test
    void shouldReturnEmptyWhenAllRepeat() {
        assertEquals(List.of(), Problem15.solve("aa"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(), Problem15.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(List.of('z'), Problem15.solve("z"));
    }

}
