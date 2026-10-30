package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 2. Do not copy directly during practice.
 */
public final class Problem2Reference {

    private Problem2Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

    }
}
