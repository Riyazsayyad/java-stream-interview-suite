package com.riyaz.streampractice.reference.level4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;import java.util.List;


/**
 * Reference solution for Problem 38. Do not copy directly during practice.
 */
public final class Problem38Reference {

    private Problem38Reference() {}

    public static Map<Boolean, List<Integer>> solve(List<Integer> numbers) {

        if (numbers == null) {
            return Map.of(false, List.of(), true, List.of());
        }
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

    }
}
