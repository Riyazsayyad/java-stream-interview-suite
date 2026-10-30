package com.riyaz.streampractice.reference.level1;

import com.riyaz.streampractice.model.SumAverageResult;
import java.util.List;
import java.util.Optional;

/**
 * Reference solution for Problem 10. Do not copy directly during practice.
 */
public final class Problem10Reference {

    private Problem10Reference() {}

    public static Optional<SumAverageResult> solve(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }
        long sum = numbers.stream().mapToLong(Integer::longValue).sum();
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        return Optional.of(new SumAverageResult(sum, avg));

    }
}
