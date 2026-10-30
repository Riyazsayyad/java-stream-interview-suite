package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.OptionalInt;

/**
 * Reference solution for Problem 9. Do not copy directly during practice.
 */
public final class Problem9Reference {

    private Problem9Reference() {}

    public static OptionalInt solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return OptionalInt.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue).min();

    }
}
