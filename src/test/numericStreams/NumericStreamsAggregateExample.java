package test.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

    public static int sumOfInts(int start, int end) {
        return IntStream.range(start, end).sum();
    }

    public static OptionalInt maxOfInts(int start, int end) {
        return IntStream.range(start, end).max();
    }

    public static OptionalLong minOfLongs(int start, int end) {
        return LongStream.range(start, end).min();
    }

    public static OptionalDouble avgOfInts(int start, int end) {
        return IntStream.range(start, end).average();
    }

    public static void main(String[] args) {
        System.out.println("Printing sum using sum():" + sumOfInts(1, 6));

        final var optionalInt = maxOfInts(1, 6);
        System.out.println("Printing max using max(): "
                + (optionalInt.isPresent() ? optionalInt.getAsInt() : 0));

        final var optionalLong = minOfLongs(5, 500);
        System.out.println("Printing max using max(): "
                + (optionalLong.isPresent() ? optionalLong.getAsLong() : 0));

        final var optionalDouble = avgOfInts(5, 500);
        System.out.println("Printing avg. using average(): "
                + (optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0));

        // result is 1, since closed range created one element: 0
        System.out.println("Testing count with rangClosed: "
                + IntStream.rangeClosed(0, 0).count());
    }
}
