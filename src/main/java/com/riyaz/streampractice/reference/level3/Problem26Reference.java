package com.riyaz.streampractice.reference.level3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 26. Do not copy directly during practice.
 */
public final class Problem26Reference {

    private Problem26Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
}
