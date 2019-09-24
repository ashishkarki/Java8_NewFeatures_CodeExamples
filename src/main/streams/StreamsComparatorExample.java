package main.streams;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Person> sortPeopleByName(List<Person> people) {
        return people
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    public static List<Person> sortPeopleByWeight(List<Person> people) {
        return people
                .stream()
                .sorted(Comparator.comparing(Person::getWeight))
                .collect(Collectors.toList());
    }

    public static List<Person> sortPeopleByWeightDesc(List<Person> people) {
        return people
                .stream()
                .sorted(Comparator.comparing(Person::getWeight).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("People sorted by their names ::");
        sortPeopleByName(CustomUtils.PERSON_LIST).forEach(System.out::println);

        System.out.println("People sorted by their weight (ascending by default) ::");
        sortPeopleByWeight(CustomUtils.PERSON_LIST).forEach(System.out::println);

        System.out.println("People sorted by their weight (descending by design) ::");
        sortPeopleByWeightDesc(CustomUtils.PERSON_LIST).forEach(System.out::println);
    }
}
