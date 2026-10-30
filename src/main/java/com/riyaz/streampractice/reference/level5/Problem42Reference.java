package com.riyaz.streampractice.reference.level5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 42. Do not copy directly during practice.
 */
public final class Problem42Reference {

    private Problem42Reference() {}

    public static List<String> solve(List<String> sentences) {

        if (sentences == null) {
            return List.of();
        }
        return sentences.stream()
                .filter(Objects::nonNull)
                .flatMap(s -> Arrays.stream(s.trim().split("\\s+")))
                .filter(w -> !w.isEmpty())
                .collect(Collectors.toList());

    }
}
