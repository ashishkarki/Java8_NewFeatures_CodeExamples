package test.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingExample {

    public static List<Integer> performBoxing(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .boxed() // this takes each 'int' primitive type and converts to 'Integer' wrapper type
                .collect(Collectors.toList());
    }

    public static int performUnboxing(List<Integer> wrapperIntegers) {
        return wrapperIntegers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> wrapperIntList = performBoxing(1, 5);
        System.out.println("Converting from int to Integer: " + wrapperIntList);

        System.out.println("Performing summation using unboxing of above Integers: "
                + performUnboxing(wrapperIntList));
    }
}
