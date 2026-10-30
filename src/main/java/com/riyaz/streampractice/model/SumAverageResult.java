package com.riyaz.streampractice.model;

/**
 * Holds sum and average for integer list statistics problems.
 */
public final class SumAverageResult {

    private final long sum;
    private final double average;

    public SumAverageResult(long sum, double average) {
        this.sum = sum;
        this.average = average;
    }

    public long getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SumAverageResult that = (SumAverageResult) o;
        return sum == that.sum && Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(sum) * 31 + Double.hashCode(average);
    }
}
