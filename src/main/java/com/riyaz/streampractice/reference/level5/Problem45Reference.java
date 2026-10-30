package com.riyaz.streampractice.reference.level5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 45. Do not copy directly during practice.
 */
public final class Problem45Reference {

    private Problem45Reference() {}

    public static String solve(List<String> strings, String delimiter, String prefix, String suffix) {

        if (strings == null) {
            return prefix + suffix;
        }
        String body = strings.stream().collect(Collectors.joining(delimiter));
        return prefix + body + suffix;

    }
}
