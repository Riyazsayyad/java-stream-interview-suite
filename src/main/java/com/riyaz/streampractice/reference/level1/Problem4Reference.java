package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 4. Do not copy directly during practice.
 */
public final class Problem4Reference {

    private Problem4Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());

    }
}
