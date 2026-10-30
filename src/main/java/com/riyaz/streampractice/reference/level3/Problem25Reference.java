package com.riyaz.streampractice.reference.level3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 25. Do not copy directly during practice.
 */
public final class Problem25Reference {

    private Problem25Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().sorted().collect(Collectors.toList());

    }
}
