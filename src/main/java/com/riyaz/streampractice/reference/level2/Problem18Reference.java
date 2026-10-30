package com.riyaz.streampractice.reference.level2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 18. Do not copy directly during practice.
 */
public final class Problem18Reference {

    private Problem18Reference() {}

    public static boolean solve(String first, String second) {

        if (first == null || second == null) {
            return false;
        }
        Function<String, Map<Character, Long>> freq = s -> s.replaceAll("\\s+", "").toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return freq.apply(first).equals(freq.apply(second));

    }
}
