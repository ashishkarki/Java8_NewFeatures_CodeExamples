package main.functionInterfaces;

import main.models.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionPersonExample {

    public final static Function<List<Person>, Map<String, String>> personToGenderMapper =
            people -> {
                var p2GMap = new HashMap<String, String>();

                people.forEach(person -> {
                    if(BiPredicateExample.ageWeightBiPredicate.test(person.getAge(), person.getWeight())) {
                        p2GMap.put(person.getName(), person.getGender());
                    }
                });

                return p2GMap;
            };
}
