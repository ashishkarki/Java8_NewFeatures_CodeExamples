package main.functionInterfaces;

import main.databases.PersonDatabase;
import main.models.Person;
import main.utilities.CustomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonExample {

    final static Predicate<Person> agePredicate = person -> person.getAge() > 20;
    final static Predicate<Person> weightPredicate = person -> person.getWeight() > 50;
    final static List<Person> personList = CustomUtils.PERSON_LIST;

    public static List<Person> filterPersonByAge() {
        List<Person> agedPersonList = new ArrayList<>();

        personList.forEach(person -> {
            if(agePredicate.test(person)) {
                agedPersonList.add(person);
            }
        });

        return agedPersonList;
    }

    public static List<Person> filterPersonByAgeAndWeight() {
        List<Person> agedWeightPersonList = new ArrayList<>();

        personList.forEach(person -> {
            if(agePredicate.and(weightPredicate).test(person)) {
                agedWeightPersonList.add(person);
            }
        });

        return agedWeightPersonList;
    }

    public static void main(String[] args) {
        System.out.println("Here are list of students > 20 age : " + filterPersonByAge());
        System.out.println("Here are list of students > 20 age and weight > 50 : " + filterPersonByAgeAndWeight());
    }
}
