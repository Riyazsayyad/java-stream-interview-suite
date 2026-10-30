package com.riyaz.streampractice.reference.level5;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;import java.util.List;


/**
 * Reference solution for Problem 41. Do not copy directly during practice.
 */
public final class Problem41Reference {

    private Problem41Reference() {}

    public static List<Integer> solve(List<List<Integer>> nested) {

        if (nested == null) {
            return List.of();
        }
        return nested.stream().flatMap(Collection::stream).collect(Collectors.toList());

    }
}
