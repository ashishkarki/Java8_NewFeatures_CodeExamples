package Common.utilities;

import main.models.Person;

import java.util.Random;
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

    public static final Supplier<Integer> randomIntSupplier = new Random()::nextInt;
}
