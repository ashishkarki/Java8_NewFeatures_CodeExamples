package main.streams;

import Common.utilities.CommonPredicatesFunctions;

import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    public static void showOfExample() {
        Stream<String> myStringStream = Stream.of("John", "Jenny", "Blake");
        myStringStream.forEach(System.out::println);
    }

    public static void showIterateExample(int limit) {
        Stream.iterate(1, x -> x * 2)
                .limit(limit)
                .forEach(System.out::println);
    }

    public static void showGenerateExample(int limit) {
        Stream.generate(CommonPredicatesFunctions.randomIntSupplier)
                .limit(limit)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        System.out.println("Printing String Stream using of()");
        showOfExample();

        System.out.println("Printing Integer Stream using iterate()");
        showIterateExample(5);

        System.out.println("Printing Integer Stream using generate()");
        showGenerateExample(5);
    }
}
