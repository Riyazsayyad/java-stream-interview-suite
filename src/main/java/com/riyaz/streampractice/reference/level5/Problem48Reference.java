package com.riyaz.streampractice.reference.level5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 48. Do not copy directly during practice.
 */
public final class Problem48Reference {

    private Problem48Reference() {}

    public static Map<Integer, Long> solve(List<Integer> numbers) {

        if (numbers == null) {
            return Map.of();
        }
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

    }
}
