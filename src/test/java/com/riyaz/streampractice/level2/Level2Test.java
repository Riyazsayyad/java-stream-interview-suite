package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level2.Problem11;
import com.riyaz.streampractice.problems.level2.Problem12;
import com.riyaz.streampractice.problems.level2.Problem13;
import com.riyaz.streampractice.problems.level2.Problem14;
import com.riyaz.streampractice.problems.level2.Problem15;
import com.riyaz.streampractice.problems.level2.Problem16;
import com.riyaz.streampractice.problems.level2.Problem17;
import com.riyaz.streampractice.problems.level2.Problem18;
import com.riyaz.streampractice.problems.level2.Problem19;
import com.riyaz.streampractice.problems.level2.Problem20;

/** Candidate tests for level 2 (problems 11–20). */
class Level2Test {

    @Nested
    @DisplayName("Problem 11: First Non-Repeating Character")
    class Problem11Tests {

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

    @Nested
    @DisplayName("Problem 12: First Repeating Character")
    class Problem12Tests {

            @Test
            void shouldFindFirstRepeatingCharacter() {
                assertEquals(Optional.of('r'), Problem12.solve("programming"));
            }

            @Test
            void shouldReturnEmptyWhenNoRepeats() {
                assertEquals(Optional.empty(), Problem12.solve("abc"));
            }

            @Test
            void shouldHandleEmptyString() {
                assertEquals(Optional.empty(), Problem12.solve(""));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.empty(), Problem12.solve("a"));
            }

            @Test
            void shouldDetectImmediateRepeat() {
                assertEquals(Optional.of('a'), Problem12.solve("aab"));
            }
    }

    @Nested
    @DisplayName("Problem 13: Character Frequency Counter")
    class Problem13Tests {

            @Test
            void shouldCountCharacterFrequency() {
                Map<Character, Long> freq = Problem13.solve("banana");
                assertEquals(1L, freq.get('b'));
                assertEquals(3L, freq.get('a'));
                assertEquals(2L, freq.get('n'));
            }

            @Test
            void shouldReturnEmptyMapForEmptyString() {
                assertEquals(Map.of(), Problem13.solve(""));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Map.of('x', 1L), Problem13.solve("x"));
            }

            @Test
            void shouldPreserveInsertionOrder() {
                Map<Character, Long> freq = Problem13.solve("abca");
                assertEquals(List.of('a', 'b', 'c'), List.copyOf(freq.keySet()));
            }

            @Test
            void shouldHandleNullAsEmpty() {
                assertEquals(Map.of(), Problem13.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 14: Find Duplicate Characters")
    class Problem14Tests {

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

    @Nested
    @DisplayName("Problem 15: Find Unique Characters")
    class Problem15Tests {

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

    @Nested
    @DisplayName("Problem 16: Most Frequently Occurring Character")
    class Problem16Tests {

            @Test
            void shouldFindMostFrequentCharacter() {
                assertEquals(Optional.of('a'), Problem16.solve("banana"));
            }

            @Test
            void shouldBreakTiesByFirstEncounter() {
                assertEquals(Optional.of('a'), Problem16.solve("ab"));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.of('x'), Problem16.solve("x"));
            }

            @Test
            void shouldReturnEmptyForEmptyString() {
                assertEquals(Optional.empty(), Problem16.solve(""));
            }

            @Test
            void shouldPickFirstAmongEqualFrequencies() {
                assertEquals(Optional.of('s'), Problem16.solve("ssww"));
            }
    }

    @Nested
    @DisplayName("Problem 17: Least Frequently Occurring Character")
    class Problem17Tests {

            @Test
            void shouldFindLeastFrequentCharacter() {
                assertEquals(Optional.of('b'), Problem17.solve("aaab"));
            }

            @Test
            void shouldBreakTiesByFirstEncounter() {
                assertEquals(Optional.of('a'), Problem17.solve("aabbcc"));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.of('q'), Problem17.solve("q"));
            }

            @Test
            void shouldReturnEmptyForEmptyString() {
                assertEquals(Optional.empty(), Problem17.solve(""));
            }

            @Test
            void shouldWorkWithUniformFrequency() {
                assertEquals(Optional.of('a'), Problem17.solve("abc"));
            }
    }

    @Nested
    @DisplayName("Problem 18: Check Anagrams")
    class Problem18Tests {

            @Test
            void shouldDetectAnagrams() {
                assertTrue(Problem18.solve("listen", "silent"));
            }

            @Test
            void shouldRejectNonAnagrams() {
                assertFalse(Problem18.solve("hello", "world"));
            }

            @Test
            void shouldIgnoreCaseAndWhitespace() {
                assertTrue(Problem18.solve("Dormitory", "Dirty room"));
            }

            @Test
            void shouldHandleEmptyStrings() {
                assertTrue(Problem18.solve("", ""));
            }

            @Test
            void shouldReturnFalseWhenNullProvided() {
                assertFalse(Problem18.solve(null, "a"));
            }
    }

    @Nested
    @DisplayName("Problem 19: Reverse a String")
    class Problem19Tests {

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

    @Nested
    @DisplayName("Problem 20: First Non-Repeating Word")
    class Problem20Tests {

            @Test
            void shouldFindFirstNonRepeatingWord() {
                assertEquals(Optional.of("great"), Problem20.solve("java is great and java is powerful"));
            }

            @Test
            void shouldTreatWordsCaseInsensitively() {
                assertEquals(Optional.of("go"), Problem20.solve("Java GO java"));
            }

            @Test
            void shouldReturnEmptyWhenAllWordsRepeat() {
                assertEquals(Optional.empty(), Problem20.solve("a a b b"));
            }

            @Test
            void shouldHandleEmptySentence() {
                assertEquals(Optional.empty(), Problem20.solve("   "));
            }

            @Test
            void shouldHandleSingleUniqueWord() {
                assertEquals(Optional.of("only"), Problem20.solve("only"));
            }
    }

}
