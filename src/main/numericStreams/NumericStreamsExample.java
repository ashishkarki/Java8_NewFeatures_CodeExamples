package main.numericStreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    /**
     * this method is wasteful in the sense that it has to unbox the Integer parameters into
     * primitive int type during calculation.
     */
    public static int getSumOfIntegers(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (a, b) -> a + b); //unboxing has to happen here
    }

    /**
     * A better solution is to use NumericStream - specifically an IntStream in this case
     * which deals with and produces primitive int directly and hence prevent redundant unboxing
     */
    public static int getSumOfIntegersBetterWay(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .sum();
    }
}
