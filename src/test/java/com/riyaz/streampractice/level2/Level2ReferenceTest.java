package com.riyaz.streampractice.level2;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.reference.level2.Problem11Reference;
import com.riyaz.streampractice.reference.level2.Problem12Reference;
import com.riyaz.streampractice.reference.level2.Problem13Reference;
import com.riyaz.streampractice.reference.level2.Problem14Reference;
import com.riyaz.streampractice.reference.level2.Problem15Reference;
import com.riyaz.streampractice.reference.level2.Problem16Reference;
import com.riyaz.streampractice.reference.level2.Problem17Reference;
import com.riyaz.streampractice.reference.level2.Problem18Reference;
import com.riyaz.streampractice.reference.level2.Problem19Reference;
import com.riyaz.streampractice.reference.level2.Problem20Reference;

/** Reference solution tests for level 2. */
class Level2ReferenceTest {

    @Nested
    @DisplayName("Problem 11: First Non-Repeating Character")
    class Problem11Tests {

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

    @Nested
    @DisplayName("Problem 12: First Repeating Character")
    class Problem12Tests {

            @Test
            void shouldFindFirstRepeatingCharacter() {
                assertEquals(Optional.of('r'), Problem12Reference.solve("programming"));
            }

            @Test
            void shouldReturnEmptyWhenNoRepeats() {
                assertEquals(Optional.empty(), Problem12Reference.solve("abc"));
            }

            @Test
            void shouldHandleEmptyString() {
                assertEquals(Optional.empty(), Problem12Reference.solve(""));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.empty(), Problem12Reference.solve("a"));
            }

            @Test
            void shouldDetectImmediateRepeat() {
                assertEquals(Optional.of('a'), Problem12Reference.solve("aab"));
            }
    }

    @Nested
    @DisplayName("Problem 13: Character Frequency Counter")
    class Problem13Tests {

            @Test
            void shouldCountCharacterFrequency() {
                Map<Character, Long> freq = Problem13Reference.solve("banana");
                assertEquals(1L, freq.get('b'));
                assertEquals(3L, freq.get('a'));
                assertEquals(2L, freq.get('n'));
            }

            @Test
            void shouldReturnEmptyMapForEmptyString() {
                assertEquals(Map.of(), Problem13Reference.solve(""));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Map.of('x', 1L), Problem13Reference.solve("x"));
            }

            @Test
            void shouldPreserveInsertionOrder() {
                Map<Character, Long> freq = Problem13Reference.solve("abca");
                assertEquals(List.of('a', 'b', 'c'), List.copyOf(freq.keySet()));
            }

            @Test
            void shouldHandleNullAsEmpty() {
                assertEquals(Map.of(), Problem13Reference.solve(null));
            }
    }

    @Nested
    @DisplayName("Problem 14: Find Duplicate Characters")
    class Problem14Tests {

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

    @Nested
    @DisplayName("Problem 15: Find Unique Characters")
    class Problem15Tests {

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

    @Nested
    @DisplayName("Problem 16: Most Frequently Occurring Character")
    class Problem16Tests {

            @Test
            void shouldFindMostFrequentCharacter() {
                assertEquals(Optional.of('a'), Problem16Reference.solve("banana"));
            }

            @Test
            void shouldBreakTiesByFirstEncounter() {
                assertEquals(Optional.of('a'), Problem16Reference.solve("ab"));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.of('x'), Problem16Reference.solve("x"));
            }

            @Test
            void shouldReturnEmptyForEmptyString() {
                assertEquals(Optional.empty(), Problem16Reference.solve(""));
            }

            @Test
            void shouldPickFirstAmongEqualFrequencies() {
                assertEquals(Optional.of('s'), Problem16Reference.solve("ssww"));
            }
    }

    @Nested
    @DisplayName("Problem 17: Least Frequently Occurring Character")
    class Problem17Tests {

            @Test
            void shouldFindLeastFrequentCharacter() {
                assertEquals(Optional.of('b'), Problem17Reference.solve("aaab"));
            }

            @Test
            void shouldBreakTiesByFirstEncounter() {
                assertEquals(Optional.of('a'), Problem17Reference.solve("aabbcc"));
            }

            @Test
            void shouldHandleSingleCharacter() {
                assertEquals(Optional.of('q'), Problem17Reference.solve("q"));
            }

            @Test
            void shouldReturnEmptyForEmptyString() {
                assertEquals(Optional.empty(), Problem17Reference.solve(""));
            }

            @Test
            void shouldWorkWithUniformFrequency() {
                assertEquals(Optional.of('a'), Problem17Reference.solve("abc"));
            }
    }

    @Nested
    @DisplayName("Problem 18: Check Anagrams")
    class Problem18Tests {

            @Test
            void shouldDetectAnagrams() {
                assertTrue(Problem18Reference.solve("listen", "silent"));
            }

            @Test
            void shouldRejectNonAnagrams() {
                assertFalse(Problem18Reference.solve("hello", "world"));
            }

            @Test
            void shouldIgnoreCaseAndWhitespace() {
                assertTrue(Problem18Reference.solve("Dormitory", "Dirty room"));
            }

            @Test
            void shouldHandleEmptyStrings() {
                assertTrue(Problem18Reference.solve("", ""));
            }

            @Test
            void shouldReturnFalseWhenNullProvided() {
                assertFalse(Problem18Reference.solve(null, "a"));
            }
    }

    @Nested
    @DisplayName("Problem 19: Reverse a String")
    class Problem19Tests {

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

    @Nested
    @DisplayName("Problem 20: First Non-Repeating Word")
    class Problem20Tests {

            @Test
            void shouldFindFirstNonRepeatingWord() {
                assertEquals(Optional.of("great"), Problem20Reference.solve("java is great and java is powerful"));
            }

            @Test
            void shouldTreatWordsCaseInsensitively() {
                assertEquals(Optional.of("go"), Problem20Reference.solve("Java GO java"));
            }

            @Test
            void shouldReturnEmptyWhenAllWordsRepeat() {
                assertEquals(Optional.empty(), Problem20Reference.solve("a a b b"));
            }

            @Test
            void shouldHandleEmptySentence() {
                assertEquals(Optional.empty(), Problem20Reference.solve("   "));
            }

            @Test
            void shouldHandleSingleUniqueWord() {
                assertEquals(Optional.of("only"), Problem20Reference.solve("only"));
            }
    }

}
