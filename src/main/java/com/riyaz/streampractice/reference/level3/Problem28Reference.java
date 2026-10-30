package com.riyaz.streampractice.reference.level3;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Reference solution for Problem 28. Do not copy directly during practice.
 */
public final class Problem28Reference {

    private Problem28Reference() {}

    public static OptionalDouble solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return OptionalDouble.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue).average();

    }
}
