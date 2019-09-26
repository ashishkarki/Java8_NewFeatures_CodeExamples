package main.defaults;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    /**
     * Example usage: sort the names in a list alphabetically
     */
    public static List<String> demoListSortPreJava8(List<String> names) {
        // Before Java8, we used Collections to sort
        Collections.sort(names);

        return names;
    }

    public static List<String> demoListSortPostJava8(List<String> names) {
        // Before Java8, we used Collections to sort
        names.sort(Comparator.naturalOrder()); // there is also a reverseOrder()

        return names;
    }

    public static List<Person> sortPeopleByWeight(List<Person> people) {
        people.sort(Comparator.comparingDouble(Person::getWeight));

        return people;
    }

    public static List<Person> sortPeopleByGenderAndWeight(List<Person> people) {
        people.sort( // this below is comparator chaining
                Comparator.comparing(Person::getGender).thenComparingDouble(Person::getWeight)
        );

        return people;
    }

    public static List<Person> sortPeopleWithNullValues(List<Person> people) {
        people.sort( // this below pushes null as first value; there is also nullsLast(Comparator..)
                Comparator.nullsFirst(Comparator.comparingDouble(Person::getWeight))
        );

        return people;
    }

    public static void main(String[] args) {
        var sortedPeople = sortPeopleByWeight(CustomUtils.PERSON_LIST);
        sortedPeople.forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        var sortedPeopleByGenderWeight = sortPeopleByGenderAndWeight(CustomUtils.PERSON_LIST);
        sortedPeopleByGenderWeight.forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        var personListWithNull = CustomUtils.PERSON_LIST;
        var sortedPeopleWithNulls = sortPeopleWithNullValues(personListWithNull);
        sortedPeopleWithNulls.forEach(System.out::println);
    }
}
