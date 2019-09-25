package main.terminalOperations;

import main.models.Person;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class JoiningCollectorExample {
    public static String performJoiningCollectionWithDelimiter(List<Person> people) {
        return people.stream()
                .limit(2)
                .map(Person::getName)
                .collect(joining("_"));
    }

    public static String performJoiningCollectionWithDelimiterPrefixSuffix(List<Person> people) {
        return people.stream()
                .limit(2)
                .map(Person::getName)
                .collect(joining("_", "(", ")"));
    }
}
