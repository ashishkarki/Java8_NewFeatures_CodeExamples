package main.optional;

import Common.utilities.CustomUtils;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> demoOfNullableNotEmpty() {
        // use case: use ofNullable if you have doubts that the argument might be null
        Optional<String> stringOptional = Optional.ofNullable(CustomUtils.someString);

        return stringOptional;
    }

    public static Optional<String> demoOfNullableEmpty() {
        // use case: use ofNullable if you have doubts that the argument might be null
        Optional<String> stringOptional = Optional.ofNullable(null);

        return stringOptional;
    }

    public static Optional<String> demoOfNotEmpty() {
        // use case: use of if you are certain that the argument will never be null
        // sending a null as argument to Of(), gives you NPE.
        Optional<String> stringOptional = Optional.ofNullable(CustomUtils.someString);

        return stringOptional;
    }

    public static Optional<String> demoEmpty() {
        // use case: use or return Optional.empty() when there is a null object and you want to still
        // return an Optional type object
        return Optional.empty();
    }
}
