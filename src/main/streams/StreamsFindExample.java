package main.streams;

import Common.utilities.CommonPredicatesFunctions;
import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.List;
import java.util.Optional;

public class StreamsFindExample {

    public static Optional<Person> findAnyPerson(List<Person> people) {
        return people.stream()
                .findAny();
    }

    public static Optional<Person> findAnyPersonWitFilter(List<Person> people) {
        return people.stream()
                .filter(CommonPredicatesFunctions.agePredicate)
                .findAny();
    }

    public static Optional<Person> findFirstPersonWitFilter(List<Person> people) {
        return people.stream()
                .filter(CommonPredicatesFunctions.agePredicate)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Person> findAnyResult = findAnyPerson(CustomUtils.PERSON_LIST);
        CustomUtils.optionalPrinterHelper(findAnyResult);

        Optional<Person> findAnyWitFilterResult = findAnyPersonWitFilter(CustomUtils.PERSON_LIST);
        CustomUtils.optionalPrinterHelper(findAnyWitFilterResult);

        Optional<Person> findFirstWitFilterResult = findFirstPersonWitFilter(CustomUtils.PERSON_LIST);
        CustomUtils.optionalPrinterHelper(findFirstWitFilterResult);
    }
}
