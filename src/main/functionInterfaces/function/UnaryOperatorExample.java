package main.functionInterfaces.function;

import main.models.Person;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static final UnaryOperator<Person> increaseAgeByTen =
            person -> {
                return new Person(
                        person.getName(),
                        person.getAge() + 10,
                        person.getWeight(),
                        person.getGender(),
                        person.getActivities());
            };
}
