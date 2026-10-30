package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 1. Do not copy directly during practice.
 */
public final class Problem1Reference {

    private Problem1Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

    }
}
