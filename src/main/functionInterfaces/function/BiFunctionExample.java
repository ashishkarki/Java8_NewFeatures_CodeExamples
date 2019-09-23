package main.functionInterfaces.function;

import main.models.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public final static BiFunction<List<Person>, Predicate<Person>, Map<String, String>> personToGenderMapper2 =
            (people, personPredicate) -> {
                var p2GMap2 = new HashMap<String, String>();
                people.forEach(person -> {
                    if (personPredicate.test(person)) {
                        p2GMap2.put(person.getName(), person.getGender());
                    }
                });

                return p2GMap2;
            };
}
