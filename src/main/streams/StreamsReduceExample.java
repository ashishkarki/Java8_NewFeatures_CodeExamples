package main.streams;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    static List<Integer> integerList = Arrays.asList(1, 3, 5, 7);

    public static int performMultiplication(List<Integer> intList) {
        return intList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Person> getPersonWithBiggestWeight(List<Person> people) {
        return people.stream()
                .reduce((p1, p2) -> (p1.getWeight() > p2.getWeight()) ? p1 : p2);
    }

    public static void main(String[] args) {
        System.out.println("Multiplication using reduce: " + performMultiplication(integerList));

        System.out.println("Finding person with biggest weight using reduce: " +
                getPersonWithBiggestWeight(CustomUtils.PERSON_LIST));
    }
}
