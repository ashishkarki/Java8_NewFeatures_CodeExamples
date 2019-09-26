package main.parallelStreams;

import java.util.stream.IntStream;

class Sum {
    private int total;

    public void performSum(int input) {
        // thing here is in a parallel stream, the total will be concurrently accessed and updated
        // which means it's most updated value might be ready when a return happens
        total += input;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

/**
 * This class shows one of the scenarios where using parallel streams might be a bad idea.
 */
public class ParallelStreamsBadSolutionExample {

    public static void main(String[] args) {
        Sum sum = new Sum();

        /**
         * Without parallel stream, we get the correct total = 500500
         * With parallel stream, we get (Surprise!) myriads of wrong/incompletely calculated values:
         * 462068, 465861, 463330 and so on..
         * The problem is since 'total' in Sum class is mutable, it wreaks havoc with parallel stream result
         */
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println("The total sum as we got from sum.getTotal(): " + sum.getTotal());
    }
}
