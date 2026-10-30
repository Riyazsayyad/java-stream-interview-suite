package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 5. Do not copy directly during practice.
 */
public final class Problem5Reference {

    private Problem5Reference() {}

    public static List<String> solve(List<String> strings) {

        if (strings == null) {
            return List.of();
        }
        return strings.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }
}
