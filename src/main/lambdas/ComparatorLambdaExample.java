package main.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Before Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // returns 0 => o1 == o2, 1 => o1 > o2, -1 => o1 < o2
            }
        };

        System.out.println("Traditional way of comparision: " + comparator.compare(2, 5)); // expected result = -1/

        /**
         * Using new Lambda way
         */
        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> o1.compareTo(o2);
        System.out.println("Lambda way of comparision: " + comparatorLambda.compare(2, 5)); // expected result = -1

        Comparator<Integer> comparatorLambda2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Another Lambda way of comparision: " + comparatorLambda2.compare(2, 5)); // expected result = -1

        Comparator<Integer> comparatorLambdaSuper = (Integer::compareTo);
        System.out.println("Super Lambda way of comparision: " + comparatorLambdaSuper.compare(2, 5)); // expected result = -1
    }
}
