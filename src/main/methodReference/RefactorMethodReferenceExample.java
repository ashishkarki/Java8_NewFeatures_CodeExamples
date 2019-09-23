package main.methodReference;

import Common.utilities.CustomUtils;
import main.models.Person;

import java.util.function.Predicate;

/**
 * @Description shows how to refactor a lambda into method reference
 */
public class RefactorMethodReferenceExample {

    public final static Predicate<Person> agePredicateLambda = person -> person.getAge() > 20;

    // following is a method reference version of the above lambda expression
    public final static Predicate<Person> agePredicateMethodRef = RefactorMethodReferenceExample::greaterThanAgeTwenty;

    public static void main(String[] args) {
        System.out.println("Using normal lambda :" + agePredicateLambda.test(CustomUtils.ONE_PERSON));

        System.out.println("Using method reference :" + agePredicateMethodRef.test(CustomUtils.ONE_PERSON));
    }

    public static boolean greaterThanAgeTwenty(Person person) {
        return person.getAge() > 20;
    }
}
