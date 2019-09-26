package main.optional;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.Optional;

public class OptionalExample {

    /**
     * Assume this method connects to a DB and returns a possibly nullable object
     */
    public static Optional<String> getPersonNameOptional() {
        Optional<Person> personOptional = Optional.ofNullable(CustomUtils.ONE_PERSON);

        if (personOptional.isPresent()) {
            return personOptional.map(Person::getName); // this returns an Optional<String>
        }

        return Optional.empty(); // this represents an optional object with no value
    }

    public static void main(String[] args) {
        Optional<String> stringOptional = getPersonNameOptional();

        if (stringOptional.isPresent()) {
            System.out.println("Name of student from fake DB: " + stringOptional.get());
        } else {
            System.out.println("Person not found in the fake DB");
        }
    }
}
