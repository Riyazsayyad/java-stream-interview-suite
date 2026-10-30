package com.riyaz.streampractice.level5;

import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.riyaz.streampractice.problems.level5.Problem49;

class Level5Problem49Test {


    @Test
    void shouldAggregateSuccessfulTransactionsByUser() {
        Map<String, Double> totals = Problem49.solve(TestDataFactory.sampleTransactions());
        assertEquals(150.0, totals.get("u1"));
        assertEquals(230.0, totals.get("u2"));
        assertEquals(40.0, totals.get("u3"));
    }

    @Test
    void shouldIgnoreFailedTransactions() {
        Transaction failed = new Transaction("x", "u9", 999, Transaction.TransactionType.CREDIT, Transaction.Status.FAILED);
        assertFalse(Problem49.solve(List.of(failed)).containsKey("u9"));
    }

    @Test
    void shouldHandleEmptyList() {
        assertEquals(Map.of(), Problem49.solve(List.of()));
    }

    @Test
    void shouldHandleSingleSuccessfulTransaction() {
        Transaction t = new Transaction("a", "u1", 10, Transaction.TransactionType.CREDIT, Transaction.Status.SUCCESS);
        assertEquals(10.0, Problem49.solve(List.of(t)).get("u1"));
    }

    @Test
    void shouldHandleNullList() {
        assertEquals(Map.of(), Problem49.solve(null));
    }

}
