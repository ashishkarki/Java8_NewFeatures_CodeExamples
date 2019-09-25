package main.terminalOperations;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class SummingAveragingCollectorsExample {

    public static int getTotalSiblings(List<Person> people) {
        return people.stream()
                .collect(summingInt(Person::getSiblings));
    }

    public static double getAvgOfSiblingsCount(List<Person> people) {
        return people.stream()
                .collect(averagingInt(Person::getSiblings));
    }

    public static void main(String[] args) {
        System.out.println("Totalling siblings using summingInt: " +
                getTotalSiblings(CustomUtils.PERSON_LIST));

        System.out.println("Averaging siblings using averagingInt: " +
                getAvgOfSiblingsCount(CustomUtils.PERSON_LIST));
    }
}
