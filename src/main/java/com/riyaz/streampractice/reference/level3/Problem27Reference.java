package com.riyaz.streampractice.reference.level3;

import java.util.List;

/**
 * Reference solution for Problem 27. Do not copy directly during practice.
 */
public final class Problem27Reference {

    private Problem27Reference() {}

    public static int solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();

    }
}
