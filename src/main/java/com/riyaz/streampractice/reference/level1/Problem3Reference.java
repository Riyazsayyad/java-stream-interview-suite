package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 3. Do not copy directly during practice.
 */
public final class Problem3Reference {

    private Problem3Reference() {}

    public static List<Integer> solve(List<Integer> numbers, int threshold) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().filter(n -> n > threshold).collect(Collectors.toList());

    }
}
