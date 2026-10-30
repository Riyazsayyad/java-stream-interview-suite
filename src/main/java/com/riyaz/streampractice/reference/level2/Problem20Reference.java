package com.riyaz.streampractice.reference.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 20. Do not copy directly during practice.
 */
public final class Problem20Reference {

    private Problem20Reference() {}

    public static Optional<String> solve(String sentence) {

        if (sentence == null || sentence.isBlank()) {
            return Optional.empty();
        }
        List<String> tokens = Arrays.stream(sentence.trim().split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        Map<String, Long> freq = tokens.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return tokens.stream().filter(w -> freq.get(w) == 1).findFirst();

    }
}
