package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem11Reference;

class Level2Problem11ReferenceTest {


    @Test
    void shouldFindFirstNonRepeatingCharacter() {
        assertEquals(Optional.of('w'), Problem11Reference.solve("swiss"));
    }

    @Test
    void shouldReturnFirstCharacterWhenAllAreUnique() {
        assertEquals(Optional.of('a'), Problem11Reference.solve("abc"));
    }

    @Test
    void shouldReturnEmptyWhenAllCharactersRepeat() {
        assertEquals(Optional.empty(), Problem11Reference.solve("aabbcc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(Optional.empty(), Problem11Reference.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('a'), Problem11Reference.solve("a"));
    }

}
