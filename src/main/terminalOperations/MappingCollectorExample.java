package main.terminalOperations;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class MappingCollectorExample {

    public static Set<String> getNameList(List<Person> people) {
        return people.stream()
                .collect(mapping(Person::getName, toSet()));
    }

    public static void main(String[] args) {
        System.out.println("Mapping only names and printing using mapping collector: " +
                getNameList(CustomUtils.PERSON_LIST));
    }
}
