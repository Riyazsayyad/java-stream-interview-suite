package com.riyaz.streampractice.reference.level1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 6. Do not copy directly during practice.
 */
public final class Problem6Reference {

    private Problem6Reference() {}

    public static List<String> solve(List<String> strings) {

        if (strings == null) {
            return List.of();
        }
        return strings.stream().map(s -> s == null ? null : s.toLowerCase()).collect(Collectors.toList());

    }
}
