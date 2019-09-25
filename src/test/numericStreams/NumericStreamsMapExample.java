package test.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SomeDummyWithInt {
    private int index;

    public SomeDummyWithInt(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "SomeDummyWithInt{" +
                "index=" + index +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

public class NumericStreamsMapExample {

    public static List<SomeDummyWithInt> performMapToObj(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(SomeDummyWithInt::new)
                .collect(Collectors.toList());
    }

    public static long performMapToLong(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToLong(integer -> integer) // this converts intStream from above to longStream
                .sum();
    }

    public static double performMapToDouble(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToDouble(integer -> integer) // this converts intStream from above to doubleStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Printing return from mapToObj::");
        performMapToObj(1, 5).forEach(System.out::println);

        System.out.println("Printing Sum from mapToLong::" + performMapToLong(1, 5));

        System.out.println("Printing Sum from mapToDouble::" + performMapToDouble(1, 5));
    }
}
