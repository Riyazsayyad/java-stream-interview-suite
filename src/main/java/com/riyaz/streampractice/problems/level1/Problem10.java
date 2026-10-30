package com.riyaz.streampractice.problems.level1;

import com.riyaz.streampractice.model.SumAverageResult;
import java.util.List;
import java.util.Optional;

public final class Problem10 {

    private Problem10() {}

/**
 * Problem 10: Calculate Sum and Average
 *
 * <p>Difficulty: Easy
 *
 * <p>Stream concepts: mapToInt, sum, average
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
 * See tests for input/output examples.
 */
    public static Optional<SumAverageResult> solve(List<Integer> numbers) {
        // TODO: Implement your solution.
        throw new UnsupportedOperationException("Implement Problem 10");
    }
}
