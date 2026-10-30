package com.riyaz.streampractice.reference.level2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;import java.util.function.Function;


/**
 * Reference solution for Problem 17. Do not copy directly during practice.
 */
public final class Problem17Reference {

    private Problem17Reference() {}

    public static Optional<Character> solve(String input) {

        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        long min = freq.values().stream().mapToLong(Long::longValue).min().orElse(0);
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == min)
                .findFirst();

    }
}
