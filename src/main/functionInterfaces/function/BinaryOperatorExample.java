package main.functionInterfaces.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public final static BinaryOperator<Integer> simpleMultiplyBinaryOperator = (a, b) -> a * b;

    final static Comparator<Integer> myComparator = Integer::compareTo;
    public final static BinaryOperator<Integer> maxByBinaryOperator = BinaryOperator.maxBy(myComparator);
    public final static BinaryOperator<Integer> minByBinaryOperator = BinaryOperator.minBy(myComparator);
}
