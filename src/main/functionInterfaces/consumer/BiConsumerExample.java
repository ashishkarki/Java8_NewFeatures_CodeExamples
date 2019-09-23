package main.functionInterfaces.consumer;

import main.databases.PersonDatabase;
import main.models.Person;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Person> personList = PersonDatabase.getPersonList();
    static BiConsumer<String, List<String>> printerBiConsumer = (name, activities) -> System.out.println(name + " is active in :" + activities);

    /**
     * A simple example of using BiConsumer
     */
    public static void performArithmetic(Integer one, Integer two) {
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication result is :" + (a * b));

        BiConsumer<Integer, Integer> divide = (a, b) -> System.out.println("Division result is : " + (a / b));

        multiply.andThen(divide).accept(one, two);
    }

    /**
     * print name and activities of Person list (similar to {@code ConsumerExample})
     */
    public static void printNameAndActivities() {
        System.out.println("Printing the person's name and activities using BiConsumer Interface");
        personList.forEach(person -> printerBiConsumer.accept(person.getName(), person.getActivities())); // this is called consumer chaining
    }


    public static void main(String[] args) {
        performArithmetic(10, 5);

        printNameAndActivities();
    }
}
