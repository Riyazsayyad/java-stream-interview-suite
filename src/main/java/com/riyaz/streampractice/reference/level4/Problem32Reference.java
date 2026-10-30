package com.riyaz.streampractice.reference.level4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 32. Do not copy directly during practice.
 */
public final class Problem32Reference {

    private Problem32Reference() {}

    public static Map<Integer, List<String>> solve(List<String> strings) {

        if (strings == null) {
            return Map.of();
        }
        return strings.stream().collect(Collectors.groupingBy(String::length));

    }
}
