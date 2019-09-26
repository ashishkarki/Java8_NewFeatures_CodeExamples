package main.optional;

import Common.utilities.CustomUtils;

import java.util.Optional;

public class OptionalPresentExample {

    // isPresent is too obvious. so lets create a demo for ifPresent
    public static void demoIfPresent(Optional optional) {
        optional.ifPresent(someStr -> System.out.println("Printing because there is non-null value: " + someStr));
    }

    public static void main(String[] args) {
        demoIfPresent(CustomUtils.personOptionalNotNull);
        demoIfPresent(CustomUtils.personOptionalNull);
    }
}
