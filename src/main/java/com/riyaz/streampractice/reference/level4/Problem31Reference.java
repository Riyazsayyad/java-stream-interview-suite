package com.riyaz.streampractice.reference.level4;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 31. Do not copy directly during practice.
 */
public final class Problem31Reference {

    private Problem31Reference() {}

    public static Map<Integer, Long> solve(List<Integer> numbers) {

        if (numbers == null) {
            return Map.of();
        }
        return numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
