package main.streams;

import Common.utilities.CustomUtils;
import main.functionInterfaces.predicate.PredicatePersonExample;
import main.models.Person;

import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        // create a map of person-name, person-activities
        var personNameActivitiesMap = CustomUtils.PERSON_LIST
                .stream()
                .collect(Collectors.toMap(Person::getName, Person::getActivities));

        var personNameActMapWithAgeWeightFilter = CustomUtils.PERSON_LIST
                .stream()
                .filter(PredicatePersonExample.agePredicate)
                .filter(PredicatePersonExample.weightPredicate)
                .collect(Collectors.toMap(Person::getName, Person::getActivities));

        System.out.println("Person Name Activities: " + personNameActivitiesMap.size());
        System.out.println("Person Name Activities With Age > 20 & Weight > 50.0: " +
                personNameActMapWithAgeWeightFilter.size());
    }
}
