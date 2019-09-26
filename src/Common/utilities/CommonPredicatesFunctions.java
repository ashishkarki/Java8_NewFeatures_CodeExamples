package Common.utilities;

import main.models.Person;
import main.models.PersonGender;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Ashish Karki
 * @Description contains public static final Predicates, Functions, Consumers and Suppliers used in the project.
 * To be shared within various classes.
 */
public class CommonPredicatesFunctions {
    public final static Predicate<Person> agePredicate = person -> person.getAge() > 20;
    public final static Predicate<Person> weightPredicate = person -> person.getWeight() > 50;
    public final static Predicate<Person> genderPredicate = person -> person.getGender() == PersonGender.MALE.label;

    public static final Supplier<Integer> randomIntSupplier = new Random()::nextInt;

    public static Consumer<Object> printAnythingConsumer = (Object s) -> System.out.println(String.valueOf(s));
}
