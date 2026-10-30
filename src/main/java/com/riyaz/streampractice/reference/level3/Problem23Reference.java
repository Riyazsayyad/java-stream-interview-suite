package com.riyaz.streampractice.reference.level3;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 23. Do not copy directly during practice.
 */
public final class Problem23Reference {

    private Problem23Reference() {}

    public static OptionalInt solve(List<Integer> numbers) {

        if (numbers == null) {
            return OptionalInt.empty();
        }
        List<Integer> distinctDesc = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if (distinctDesc.size() < 2) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(distinctDesc.get(1));

    }
}
