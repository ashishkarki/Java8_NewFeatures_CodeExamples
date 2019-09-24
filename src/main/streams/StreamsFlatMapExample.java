package main.streams;

import main.models.Person;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFlatMapExample {

    public static final Function<Person, List<String>> personToActivitiesListFunc = Person::getActivities;

    /**
     * Example usage: print a list of activities for each person using streams and flatMap
     */
    public static List<String> getAllDistinctSortedActivities(List<Person> personList) {
        List<String> activitiesList = getFlatMapOfAllActivities(personList)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return activitiesList;
    }

    /**
     * @return the total count of activities
     */
    public static Long getCountOfDistinctActivities(List<Person> personList) {
        Long count = getFlatMapOfAllActivities(personList)
                .distinct()
                .count();

        return count;
    }

    private static Stream<String> getFlatMapOfAllActivities(List<Person> personList) {
        final var allActivitiesStream = personList.stream()
                .map(personToActivitiesListFunc)
                .flatMap(List::stream);

        return allActivitiesStream;
    }
}
