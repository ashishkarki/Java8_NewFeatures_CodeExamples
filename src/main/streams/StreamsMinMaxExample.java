package main.streams;

import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> x < y ? x : y);
    }
}