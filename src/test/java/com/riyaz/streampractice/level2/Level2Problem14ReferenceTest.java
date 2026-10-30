package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem14Reference;

class Level2Problem14ReferenceTest {


    @Test
    void shouldFindDuplicateCharacters() {
        assertEquals(List.of('r', 'g', 'm'), Problem14Reference.solve("programming"));
    }

    @Test
    void shouldReturnEmptyWhenNoDuplicates() {
        assertEquals(List.of(), Problem14Reference.solve("abc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(), Problem14Reference.solve(""));
    }

    @Test
    void shouldReturnEachDuplicateOnce() {
        assertEquals(List.of('a'), Problem14Reference.solve("aaa"));
    }

    @Test
    void shouldMaintainEncounterOrder() {
        assertEquals(List.of('a', 'b'), Problem14Reference.solve("abba"));
    }

}
