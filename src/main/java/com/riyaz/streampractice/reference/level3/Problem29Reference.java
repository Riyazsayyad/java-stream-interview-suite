package com.riyaz.streampractice.reference.level3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 29. Do not copy directly during practice.
 */
public final class Problem29Reference {

    private Problem29Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

    }
}
