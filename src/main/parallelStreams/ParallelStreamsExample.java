package main.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {

    public static long checkMethodPerformance(Supplier<Integer> supplier, int numOfTimes) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < numOfTimes; i++) {
            supplier.get();
        }

        final long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static int sumUsingSequentialStream() {
        return IntStream.rangeClosed(1, 1000000)
                .sum();
    }

    public static int sumUsingParallelStream() {
        return IntStream.rangeClosed(1, 1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Printing total time in ms using sequential stream: " +
                checkMethodPerformance(ParallelStreamsExample::sumUsingSequentialStream, 20));

        System.out.println("Printing total time in ms using parallel stream: " +
                checkMethodPerformance(ParallelStreamsExample::sumUsingParallelStream, 20));

        System.out.println("Out of curiosity, the num. of processors in this machine is :" +
                Runtime.getRuntime().availableProcessors() +
                " => know that this is the number of threads that a parallel stream creates.");
    }
}
