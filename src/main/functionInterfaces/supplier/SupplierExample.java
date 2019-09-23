package main.functionInterfaces.supplier;

import main.models.Person;
import main.models.PersonGender;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    public static final Supplier<Person> personSupplier = () -> {
        return new Person(
                "James",
                25,
                68.5,
                PersonGender.MALE.label,
                Arrays.asList("cricket", "chess"));
    };
}
