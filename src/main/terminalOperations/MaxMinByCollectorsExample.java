package main.terminalOperations;

import main.models.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MaxMinByCollectorsExample {

    public static Optional<Person> getMaxByAgePerson(List<Person> people) {
        return people.stream()
                .collect(maxBy(Comparator.comparing(Person::getAge)));
    }

    public static Optional<Person> getMinByAgePerson(List<Person> people) {
        return people.stream()
                .collect(minBy(Comparator.comparing(Person::getAge)));
    }
}
