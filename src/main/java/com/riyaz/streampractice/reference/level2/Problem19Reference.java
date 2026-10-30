package com.riyaz.streampractice.reference.level2;

import java.util.Collections;
import java.util.stream.Collectors;import java.util.stream.Collectors;


/**
 * Reference solution for Problem 19. Do not copy directly during practice.
 */
public final class Problem19Reference {

    private Problem19Reference() {}

    public static String solve(String input) {

        if (input == null) {
            return "";
        }
        return input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream().collect(Collectors.joining());
                }));

    }
}
