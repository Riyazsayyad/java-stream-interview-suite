package com.riyaz.streampractice.reference.level5;

import com.riyaz.streampractice.model.Transaction;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reference solution for Problem 49. Do not copy directly during practice.
 */
public final class Problem49Reference {

    private Problem49Reference() {}

    public static Map<String, Double> solve(List<Transaction> transactions) {

        if (transactions == null) {
            return Map.of();
        }
        return transactions.stream()
                .filter(t -> t.getStatus() == Transaction.Status.SUCCESS)
                .collect(Collectors.groupingBy(Transaction::getUserId, Collectors.summingDouble(Transaction::getAmount)));

    }
}
