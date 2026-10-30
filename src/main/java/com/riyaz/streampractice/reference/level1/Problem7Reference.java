package com.riyaz.streampractice.reference.level1;

import java.util.List;

/**
 * Reference solution for Problem 7. Do not copy directly during practice.
 */
public final class Problem7Reference {

    private Problem7Reference() {}

    public static long solve(List<Integer> numbers) {

        if (numbers == null) {
            return 0;
        }
        return numbers.stream().count();

    }
}
