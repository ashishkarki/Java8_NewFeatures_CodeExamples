package main.streams;

import Common.utilities.CustomUtils;
import main.models.Person;
import main.models.PersonGender;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Person> getListBasedOnGender(List<Person> people, String gender) {
        return people.stream()
                .filter(person -> person.getGender() == gender)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Filtering people based on gender: Male");
        getListBasedOnGender(CustomUtils.PERSON_LIST, PersonGender.MALE.label).forEach(System.out::println);
    }
}
