package com.riyaz.streampractice.reference.level5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Reference solution for Problem 43. Do not copy directly during practice.
 */
public final class Problem43Reference {

    private Problem43Reference() {}

    public static Optional<String> solve(List<String> strings) {

        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }
        Comparator<String> byLength = Comparator.comparingInt(String::length);
        return strings.stream().max(byLength.thenComparing(Comparator.comparingInt(strings::indexOf).reversed()));

    }
}
