package com.riyaz.streampractice.reference.level2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 11. Do not copy directly during practice.
 */
public final class Problem11Reference {

    private Problem11Reference() {}

    public static Optional<Character> solve(String input) {

        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == 1)
                .findFirst();

    }
}
