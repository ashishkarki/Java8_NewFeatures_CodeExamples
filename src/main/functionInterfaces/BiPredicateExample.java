package main.functionInterfaces;

import main.models.Person;
import main.utilities.CustomUtils;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    final static BiPredicate<Integer, Double> ageWeightBiPredicate =
            (age, weight) -> age > 20 && weight >= 50.0;
    // and just for the sake of printing, we create a biConsumer
    final static BiConsumer<String, List<String>> printerBiConsumer =
            (name, activities) -> System.out.println("This person name: " + name + " is busy with " + activities);

    public static void filterBasedOnAgeAndWeight(List<Person> people) {
        people.forEach(person -> {
            if (ageWeightBiPredicate.test(person.getAge(), person.getWeight())) {
                printerBiConsumer.accept(person.getName(), person.getActivities());
            }
        });
    }

    public static void main(String[] args) {
        filterBasedOnAgeAndWeight(CustomUtils.PERSON_LIST);
    }
}
