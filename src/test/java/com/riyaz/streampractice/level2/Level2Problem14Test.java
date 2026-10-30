package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem14;

class Level2Problem14Test {


    @Test
    void shouldFindDuplicateCharacters() {
        assertEquals(List.of('r', 'g', 'm'), Problem14.solve("programming"));
    }

    @Test
    void shouldReturnEmptyWhenNoDuplicates() {
        assertEquals(List.of(), Problem14.solve("abc"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals(List.of(), Problem14.solve(""));
    }

    @Test
    void shouldReturnEachDuplicateOnce() {
        assertEquals(List.of('a'), Problem14.solve("aaa"));
    }

    @Test
    void shouldMaintainEncounterOrder() {
        assertEquals(List.of('a', 'b'), Problem14.solve("abba"));
    }

}
