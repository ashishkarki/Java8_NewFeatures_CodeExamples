package main.functionInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> checkIfEvenPredicate = n -> n % 2 == 0;
    static Predicate<Integer> checkIfDivisibleByFive = n -> n % 5 == 0;

    public static boolean simplePredicate(Integer num) {
        return checkIfEvenPredicate.test(num);
    }

    public static boolean usingPredicateAnd(Integer num) {
        return checkIfEvenPredicate.and(checkIfDivisibleByFive).test(num); // predicate chaining with 'and'
    }

    public static boolean usingPredicateOr(Integer num) {
        return checkIfEvenPredicate.or(checkIfDivisibleByFive).test(num); // predicate chaining with 'or'
    }

    // negate reverses the result
    public static boolean usingPredicateOrWithNegate(Integer num) {
        return checkIfEvenPredicate.or(checkIfDivisibleByFive).negate().test(num); // this is originally  true; negate makes it false
    }

    public static void main(String[] args) {
        System.out.println("Checking if 4 is even: " + simplePredicate(4));

        System.out.println("Checking if 10 is divisible by 2 and 5: " + usingPredicateAnd(10));
        System.out.println("Checking if 4 is divisible by 2 and 5: " + usingPredicateAnd(4));

        System.out.println("Checking if 10 is divisible by 2 or 5: " + usingPredicateOr(10));
        System.out.println("Checking if 4 is divisible by 2 or 5: " + usingPredicateOr(4));

        System.out.println("Checking if 4 is divisible by 2 or 5 appended with a negate: " + usingPredicateOrWithNegate(4));
    }
}
