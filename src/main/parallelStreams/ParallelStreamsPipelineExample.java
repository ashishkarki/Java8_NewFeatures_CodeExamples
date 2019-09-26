package main.parallelStreams;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsPipelineExample {

    public static List<String> sequentialGetPersonActivities(List<Person> people) {
        long startTime = System.currentTimeMillis();

        var activities = people.stream()
                .map(Person::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("Duration in ms for sequentialGetPersonActivities: " + (endTime - startTime));
        return activities;
    }

    public static List<String> parallelGetPersonActivities(List<Person> people) {
        long startTime = System.currentTimeMillis();

        var activities = people.stream()
                .parallel()
                .map(Person::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("Duration in ms for parallelGetPersonActivities: " + (endTime - startTime));
        return activities;
    }

    public static void main(String[] args) {
        sequentialGetPersonActivities(CustomUtils.PERSON_LIST);
        parallelGetPersonActivities((CustomUtils.PERSON_LIST));

    }
}
