package com.riyaz.streampractice.reference.level3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 30. Do not copy directly during practice.
 */
public final class Problem30Reference {

    private Problem30Reference() {}

    public static List<Integer> solve(List<Integer> first, List<Integer> second) {

        if (first == null || second == null) {
            return List.of();
        }
        Set<Integer> secondSet = second.stream().collect(Collectors.toSet());
        return first.stream().filter(secondSet::contains).distinct().collect(Collectors.toList());

    }
}
