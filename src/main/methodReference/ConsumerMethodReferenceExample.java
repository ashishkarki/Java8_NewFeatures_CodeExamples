package main.methodReference;

import main.models.Person;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    public static final Consumer<String> simpleConsumerLambda = (str) -> System.out.println(str);

    public static final Consumer<String> simpleConsumerMethodRef = System.out::println;

    public static final Consumer<Person> activitiesPrinterConsumerMethodRef = Person::printListOfActivities;
}
