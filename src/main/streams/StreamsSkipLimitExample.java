package main.streams;

import java.util.List;
import java.util.Optional;

public class StreamsSkipLimitExample {

    public static Optional<Integer> limitStreamToN(List<Integer> integerList, int n) {
        return integerList.stream()
                .limit(n) // this will cause only the first n elements to be considered
                .reduce((a, b) -> a + b);
    }

    public static Optional<Integer> skipNElementsFromStream(List<Integer> integerList, int n) {
        return integerList.stream()
                .skip(n) // this will cause the first n elements to be skipped
                .reduce((a, b) -> a + b);
    }
}
