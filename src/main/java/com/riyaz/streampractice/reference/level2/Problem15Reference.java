package com.riyaz.streampractice.reference.level2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;import java.util.function.Function;


/**
 * Reference solution for Problem 15. Do not copy directly during practice.
 */
public final class Problem15Reference {

    private Problem15Reference() {}

    public static List<Character> solve(String input) {

        if (input == null || input.isEmpty()) {
            return List.of();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == 1)
                .distinct()
                .collect(Collectors.toList());

    }
}
