package main.functionInterfaces;

import main.databases.PersonDatabase;
import main.models.Person;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    final static Predicate<Person> agePredicate = person -> person.getAge() > 20;
    final static Predicate<Person> weightPredicate = person -> person.getWeight() > 50;
    final static BiConsumer<String, List<String>> printConsumer = (name, activities) -> System.out.println("This " + name + " person likes: " + activities);

    final static Consumer<Person> personConsumer = person -> {
        if (agePredicate.and(weightPredicate).test(person)) {
            printConsumer.accept(person.getName(), person.getActivities());
        }
    };

    final static void printPersonAndActivities(List<Person> personList) {
        personList.forEach(personConsumer);
    }

    public static void main(String[] args) {
        final List<Person> personList = PersonDatabase.getPersonList();

        printPersonAndActivities(personList);
    }
}
