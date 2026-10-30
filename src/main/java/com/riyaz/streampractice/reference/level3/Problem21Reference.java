package com.riyaz.streampractice.reference.level3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 21. Do not copy directly during practice.
 */
public final class Problem21Reference {

    private Problem21Reference() {}

    public static List<Integer> solve(List<Integer> numbers) {

        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().distinct().collect(Collectors.toList());

    }
}
