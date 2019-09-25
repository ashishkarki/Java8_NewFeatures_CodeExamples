package main.terminalOperations;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.*;

import static java.util.stream.Collectors.*;

public class GroupingByCollectorExample {

    /**
     * Demo of one argument version of groupingBy
     */
    public static Map<String, List<Person>> groupPeopleByGender(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender));
    }

    /**
     * Demo of two arguments version of groupingBy
     */
    public static Map<String, Map<String, List<Person>>> groupPeopleByGenderAndAge(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender,
                        groupingBy(person -> person.getAge() > 40 ? "OLD" : "YOUNG")));
    }

    /**
     * Demo of two arguments version of groupingBy
     */
    public static Map<String, Integer> groupPeopleByGenderAndSumSiblings(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender,
                        summingInt(Person::getSiblings)));
    }

    /**
     * Demo of three arguments version of groupingBy
     */
    public static LinkedHashMap<String, Set<Person>> groupPeopleByGenderWithThreeArgs(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender, LinkedHashMap::new, toSet()));
    }

    /**
     * Demo of of groupingBy with maxBy: find person with max weight in each gender group
     */
    public static Map<String, Person> calculateTopWeightByGender(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender,
                        collectingAndThen(maxBy(Comparator.comparing(Person::getWeight)), Optional::get)));
    }

    /**
     * Demo of of groupingBy with minBy: find person with min weight in each gender group
     */
    public static Map<String, Person> calculateBottomWeightByGender(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getGender,
                        collectingAndThen(minBy(Comparator.comparing(Person::getWeight)), Optional::get)));
    }

    public static void main(String[] args) {
        System.out.println("Grouping folks by gender: \n" +
                groupPeopleByGender(CustomUtils.PERSON_LIST));

        System.out.println("Grouping folks by gender and age: \n" +
                groupPeopleByGenderAndAge(CustomUtils.PERSON_LIST));

        System.out.println("Grouping folks by gender and sum of siblings: \n" +
                groupPeopleByGenderAndSumSiblings(CustomUtils.PERSON_LIST));

        System.out.println("Grouping folks by gender using three argument version: \n" +
                groupPeopleByGenderWithThreeArgs(CustomUtils.PERSON_LIST));

        System.out.println("Calculating top weight in age group class: \n" +
                calculateTopWeightByGender(CustomUtils.PERSON_LIST));
    }
}
