package com.riyaz.streampractice.problems.level4;

import com.riyaz.streampractice.model.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public final class Problem34 {

    private Problem34() {}

/**
 * Problem 34: Highest-Paid Employee
 *
 * <p>Difficulty: Medium
 *
 * <p>Stream concepts: max, Comparator
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
    public static Optional<Employee> solve(List<Employee> employees) {
        // TODO: Implement your solution.
        throw new UnsupportedOperationException("Implement Problem 34");
    }
}
