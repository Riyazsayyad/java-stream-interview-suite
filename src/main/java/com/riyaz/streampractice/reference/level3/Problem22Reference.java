package com.riyaz.streampractice.reference.level3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 22. Do not copy directly during practice.
 */
public final class Problem22Reference {

    private Problem22Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
