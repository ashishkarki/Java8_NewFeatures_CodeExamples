package main.terminalOperations;

import Common.utilities.CommonPredicatesFunctions;
import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class PartitioningByCollectorExample {

    /**
     * partitioningBy - one argument version
     */
    public static Map<Boolean, List<Person>> partitionByGender(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(CommonPredicatesFunctions.genderPredicate));
    }

    /**
     * partitioningBy - two arguments version
     *
     * @return
     */
    public static Map<Boolean, Integer> partitionByGenderTwoArgs(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(
                        CommonPredicatesFunctions.genderPredicate, summingInt(Person::getAge)));
    }

    public static void main(String[] args) {
        System.out.println("Printing partitioning by gender: " +
                partitionByGender(CustomUtils.PERSON_LIST));

        System.out.println("Printing partitioning by gender and age: " +
                partitionByGenderTwoArgs(CustomUtils.PERSON_LIST));
    }
}
