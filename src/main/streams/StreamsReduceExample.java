package main.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsReduceExample {

    static List<Integer> integerList = Arrays.asList(1, 3, 5, 7);

    public static int performMultiplication(List<Integer> intList) {
        return intList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println("Mulitiplication using reduce: " + performMultiplication(integerList));
    }
}
