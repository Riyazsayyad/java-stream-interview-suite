package com.riyaz.streampractice.reference.level2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 13. Do not copy directly during practice.
 */
public final class Problem13Reference {

    private Problem13Reference() {}

    public static Map<Character, Long> solve(String input) {

        if (input == null || input.isEmpty()) {
            return Map.of();
        }
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

    }
}
