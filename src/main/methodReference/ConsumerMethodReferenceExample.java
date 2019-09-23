package main.methodReference;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    public static final Consumer<String> simpleConsumerLambda = (str) -> System.out.println(str);

    public static final Consumer<String> simpleConsumerMethodRef = System.out::println;

    public static final Consumer<Person> activitiesPrinterConsumerMethodRef = Person::printListOfActivities;

    public static void main(String[] args) {
        simpleConsumerLambda.accept("using consumer lambda");
        simpleConsumerMethodRef.accept("using consumer method ref");
        CustomUtils.PERSON_LIST.forEach(person -> {
            activitiesPrinterConsumerMethodRef.accept(person);
        });
    }
}
