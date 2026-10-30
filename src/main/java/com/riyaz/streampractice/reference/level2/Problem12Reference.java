package com.riyaz.streampractice.reference.level2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;import java.util.function.Function;


/**
 * Reference solution for Problem 12. Do not copy directly during practice.
 */
public final class Problem12Reference {

    private Problem12Reference() {}

    public static Optional<Character> solve(String input) {

        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) > 1)
                .findFirst();

    }
}
