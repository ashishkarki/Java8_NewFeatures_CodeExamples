package main.constructorReference;

import main.models.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static final Supplier<Person> personSupplier = Person::new;
    public static final Function<String, Person> personCreatorFunction = Person::new;

    public static void main(String[] args) {
        System.out.println("Empty Person instance created using Constructor ref. : "
                + personSupplier.get());

        System.out.println("Person instance with specified name created: "
                + personCreatorFunction.apply("John Doe"));
    }
}
