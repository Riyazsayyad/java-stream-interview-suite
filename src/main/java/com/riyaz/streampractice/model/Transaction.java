package com.riyaz.streampractice.model;

import java.util.Objects;

/**
 * Financial transaction for aggregation problems.
 */
public final class Transaction {

    public enum TransactionType {
        DEBIT,
        CREDIT,
        REFUND
    }

    public enum Status {
        SUCCESS,
        FAILED,
        PENDING
    }

    private final String transactionId;
    private final String userId;
    private final double amount;
    private final TransactionType transactionType;
    private final Status status;

    public Transaction(
            String transactionId,
            String userId,
            double amount,
            TransactionType transactionType,
            Status status) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transaction that = (Transaction) o;
        return Objects.equals(transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId);
    }
}
