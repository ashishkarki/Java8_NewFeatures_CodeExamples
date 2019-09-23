package main.functionInterfaces;

import main.databases.PersonDatabase;
import main.models.Person;
import main.utilities.CustomUtils;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerExample {

    static List<Person> personList = CustomUtils.PERSON_LIST;
    static Consumer<Person> consumer = person -> System.out.println(person);
    static Consumer<Person> nameConsumer = person -> System.out.print(person.getName() + " is active in : ");
    static Consumer<Person> activitiesConsumer = person -> System.out.println(person.getActivities());

    public static void printPersonList() {
        System.out.println("Now printing the person list using Consumer Interface");
        personList.forEach(consumer);
    }

    public static void printNameAndActivities() {
        System.out.println("Now printing the person's name and activities using Consumer Interface");
        personList.forEach(nameConsumer.andThen(activitiesConsumer)); // this is called consumer chaining
    }

    public static void printNameAndActivitiesUsingAgeCondition() {
        System.out.println("Now printing the person's name and activities given age condition using Consumer Interface");
        personList.forEach(person -> {
            if (person.getAge() > 20) {
                nameConsumer.andThen(activitiesConsumer).accept(person);
            }
        }); // this is inline consumer interface using lambda

        // another way of doing this
        List<Person> personListOverAge = personList.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println("Printing person's name and activities given age condition Using stream/filter");
        personListOverAge.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Hello from Java8");

        printPersonList();
        printNameAndActivities();
        printNameAndActivitiesUsingAgeCondition();
    }
}
