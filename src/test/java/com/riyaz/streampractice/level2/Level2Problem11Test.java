package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem11;

class Level2Problem11Test {


    @Test
    void shouldFindFirstNonRepeatingCharacter() {
        assertEquals(Optional.of('w'), Problem11.solve("swiss"));
    }

    @Test
    void shouldReturnFirstCharacterWhenAllAreUnique() {
        assertEquals(Optional.of('a'), Problem11.solve("abc"));
    }

    @Test
    void shouldReturnEmptyWhenAllCharactersRepeat() {
        assertEquals(Optional.empty(), Problem11.solve("aabbcc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(Optional.empty(), Problem11.solve(""));
    }

    @Test
    void shouldHandleSingleCharacter() {
        assertEquals(Optional.of('a'), Problem11.solve("a"));
    }

}
