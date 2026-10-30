package com.riyaz.streampractice.common;

import com.riyaz.streampractice.model.Department;
import com.riyaz.streampractice.model.Employee;
import com.riyaz.streampractice.model.Transaction;
import com.riyaz.streampractice.model.Transaction.Status;
import com.riyaz.streampractice.model.Transaction.TransactionType;
import java.util.List;

/**
 * Shared sample data for employee and transaction stream problems.
 */
public final class TestDataFactory {

    private TestDataFactory() {}

    /**
     * Returns a diverse employee list for grouping and salary problems.
     */
    public static List<Employee> sampleEmployees() {
        return List.of(
                new Employee(1, "Alice", 30, Department.ENGINEERING, 120_000, "Austin"),
                new Employee(2, "Bob", 28, Department.ENGINEERING, 110_000, "Austin"),
                new Employee(3, "Carol", 35, Department.SALES, 95_000, "Chicago"),
                new Employee(4, "Dave", 40, Department.SALES, 105_000, "Chicago"),
                new Employee(5, "Eve", 32, Department.HR, 80_000, "Denver"),
                new Employee(6, "Frank", 29, Department.FINANCE, 115_000, "Seattle"),
                new Employee(7, "Grace", 31, Department.MARKETING, 90_000, "Boston"),
                new Employee(8, "Heidi", 27, Department.ENGINEERING, 120_000, "Austin"),
                new Employee(9, "Ivan", 33, Department.OPERATIONS, 85_000, "Miami"),
                new Employee(10, "Judy", 36, Department.FINANCE, 125_000, "Seattle"));
    }

    /**
     * Returns transactions with mixed statuses for user aggregation problems.
     */
    public static List<Transaction> sampleTransactions() {
        return List.of(
                new Transaction("t1", "u1", 100.0, TransactionType.CREDIT, Status.SUCCESS),
                new Transaction("t2", "u1", 50.0, TransactionType.DEBIT, Status.SUCCESS),
                new Transaction("t3", "u1", 25.0, TransactionType.CREDIT, Status.FAILED),
                new Transaction("t4", "u2", 200.0, TransactionType.CREDIT, Status.SUCCESS),
                new Transaction("t5", "u2", 75.0, TransactionType.REFUND, Status.FAILED),
                new Transaction("t6", "u3", 40.0, TransactionType.CREDIT, Status.SUCCESS),
                new Transaction("t7", "u3", 60.0, TransactionType.CREDIT, Status.PENDING),
                new Transaction("t8", "u2", 30.0, TransactionType.DEBIT, Status.SUCCESS));
    }
}
