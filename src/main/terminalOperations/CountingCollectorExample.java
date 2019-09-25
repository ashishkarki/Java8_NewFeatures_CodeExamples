package main.terminalOperations;

import Common.utilities.CommonPredicatesFunctions;
import main.models.Person;

import java.util.List;

import static java.util.stream.Collectors.counting;

public class CountingCollectorExample {

    public static long performJoiningCollectionWithDelimiter(List<Person> people) {
        return people.stream()
                .filter(CommonPredicatesFunctions.agePredicate)
                .map(Person::getName)
                .collect(counting());
    }
}
