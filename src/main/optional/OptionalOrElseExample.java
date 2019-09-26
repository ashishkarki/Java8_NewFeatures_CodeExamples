package main.optional;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String demoOrElse(Optional<Person> optionalPerson) {
        // use case: to return a default/custom value in cases where an operation returns a null
        var name = optionalPerson.map(Person::getName).orElse(CustomUtils.someString);

        return name;
    }

    public static String demoOrElseGet(Optional<Person> optionalPerson) {
        // use case: same as orElse (to return a default/custom value in cases where an operation returns a null),
        // but, it takes a Supplier as input rather than any object.
        var name = optionalPerson.map(Person::getName).orElseGet(() -> CustomUtils.someString);

        return name;
    }

    public static String demoOrElseThrow(Optional<Person> optionalPerson) {
        // use case: similar to orElseGet, it requires a supplier as argument; in case of a null value throws an exception
        // back to the caller
        var name = optionalPerson.map(Person::getName).orElseThrow(() -> new RuntimeException(CustomUtils.someString));

        return name;
    }
}
