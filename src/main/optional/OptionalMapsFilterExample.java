package main.optional;

import Common.utilities.CommonPredicatesFunctions;
import Common.utilities.CustomUtils;
import main.models.Car;
import main.models.Person;

import java.util.Optional;

public class OptionalMapsFilterExample {

    public static void demoOptionalFilter(Optional<Person> optional) {
        optional.filter(CommonPredicatesFunctions.genderPredicate)
                .ifPresent(person -> System.out.println("here is the person i got: " + person));
    }

    public static String demoOptionalFilterMap(Optional<Person> optional) {
        String strFromOptional = "ERROR, EMPTY STRING";
        if (optional.isPresent()) {
            strFromOptional = optional.filter(CommonPredicatesFunctions.genderPredicate)
                    .map(Person::getName)
                    .toString();
        }

        return strFromOptional;
    }

    public static Optional<String> demoOptionalFilterFlatMap(Optional<Person> optional) {
        Optional<String> stringOptional = optional.filter(CommonPredicatesFunctions.agePredicate)
                .flatMap(Person::getCar) // flatMap allows us to extract nested objects
                // i.e get the Optional car object inside Optional object
                .map(Car::getMake);

        return stringOptional;
    }

    public static void main(String[] args) {
        demoOptionalFilter(CustomUtils.personOptionalNotNull);

        System.out.println(demoOptionalFilterMap(CustomUtils.personOptionalNotNull));
        System.out.println(demoOptionalFilterMap(CustomUtils.personOptionalNull));

        demoOptionalFilterFlatMap(CustomUtils.personOptionalNotNull).ifPresent(s -> System.out.println(s));
    }
}
