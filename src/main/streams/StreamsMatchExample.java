package main.streams;

import Common.utilities.CommonPredicatesFunctions;
import main.models.Person;

import java.util.List;

public class StreamsMatchExample {

    public static boolean checkForAllMatch(List<Person> people) {
        return people.stream()
                .allMatch(CommonPredicatesFunctions.agePredicate);
    }

    public static boolean checkForAnyMatch(List<Person> people) {
        return people.stream()
                .anyMatch(CommonPredicatesFunctions.agePredicate);
    }

    public static boolean checkForNoneMatch(List<Person> people) {
        return people.stream()
                .noneMatch(CommonPredicatesFunctions.agePredicate);
    }

}
