package com.riyaz.streampractice.reference.level3;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 24. Do not copy directly during practice.
 */
public final class Problem24Reference {

    private Problem24Reference() {}

    public static OptionalInt solve(List<Integer> numbers) {

        if (numbers == null) {
            return OptionalInt.empty();
        }
        List<Integer> distinctAsc = numbers.stream().distinct().sorted().collect(Collectors.toList());
        if (distinctAsc.size() < 2) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(distinctAsc.get(1));

    }
}
