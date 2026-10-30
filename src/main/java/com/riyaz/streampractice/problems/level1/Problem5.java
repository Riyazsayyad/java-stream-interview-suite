package com.riyaz.streampractice.problems.level1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Problem5 {

    private Problem5() {}

/**
 * Problem 5: Convert Strings to Uppercase
 *
 * <p>Difficulty: Easy
 *
 * <p>Stream concepts: map
 *
 * <p>Recommended approach: Use sequential Stream pipeline; avoid mutating inputs.
 *
 * <p>Time complexity: O(n) typical unless sorting dominates.
 *
 * <p>Space complexity: O(n) for collected results.
 *
 * <p>Common mistakes: Using parallelStream unnecessarily; ignoring empty inputs.
 *
 * <p>Follow-up interview questions:
 * <ul>
 *   <li>How would you optimize this for very large datasets?</li>
 *   <li>When would you prefer a traditional loop over Streams?</li>
 * </ul>
 *
 * Null strings are skipped. Empty strings become empty uppercase strings.
 */
    public static List<String> solve(List<String> strings) {
        // TODO: Implement your solution.
        throw new UnsupportedOperationException("Implement Problem 5");
    }
}
