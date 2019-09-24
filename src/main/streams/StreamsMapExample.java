package main.streams;

import main.models.Person;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static Function<Person, String> personToNameFunction = Person::getName;

    /**
     * As an example of using map(), we will take Person-list as input and convert it into a String-list
     */
    public static List<String> getNameListFromMap(List<Person> personList) {
        List<String> nameList = personList
                .stream() // this creates Stream<Person>
                .map(personToNameFunction) // this maps/creates that to Stream<String>
                .collect(Collectors.toList());

        return nameList;
    }
}
