package main.streams;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;

public class StreamsMapReduceExample {

    /**
     * Example usage: find out what is the total number of siblings that all people in our database have
     */
    public static int findTotalNumberOfSiblings(List<Person> people) {
        final int totalSiblings = people.stream()
                .filter(person -> person.getAge() > 20 && person.getWeight() > 60.0)
                .map(Person::getSiblings)
                //.reduce(0, (a, b) -> a + b)
                .reduce(0, Integer::sum);

        return totalSiblings;
    }

    public static void main(String[] args) {
        System.out.println("Total siblings of everyone is " + findTotalNumberOfSiblings(CustomUtils.PERSON_LIST));
    }
}
