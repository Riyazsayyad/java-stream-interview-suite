package com.riyaz.streampractice.problems.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Problem20 {

    private Problem20() {}

/**
 * Problem 20: First Non-Repeating Word
 *
 * <p>Difficulty: Medium
 *
 * <p>Stream concepts: flatMap, groupingBy
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
 * Words tokenized on whitespace; comparison is case-insensitive.
 */
    public static Optional<String> solve(String sentence) {
        // TODO: Implement your solution.
        throw new UnsupportedOperationException("Implement Problem 20");
    }
}
