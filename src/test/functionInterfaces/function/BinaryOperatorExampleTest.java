package test.functionInterfaces.function;

import main.functionInterfaces.function.BinaryOperatorExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryOperatorExampleTest {

    @Test
    final void testSimpleMultiplyBinaryOperator() {
        final Integer expectedProduct = 100;
        final Integer actualProduct = BinaryOperatorExample.simpleMultiplyBinaryOperator.apply(5, 20);

        assertTrue(expectedProduct == actualProduct);
    }

    @Test
    final void testMaxByBinaryOperator() {
        final Integer expectedMax = 50;
        final Integer actualMax = BinaryOperatorExample.maxByBinaryOperator.apply(5, 50);

        assertTrue(expectedMax == actualMax);
    }

    @Test
    final void testMinByBinaryOperator() {
        final Integer expectedMin = 5;
        final Integer actualMin = BinaryOperatorExample.minByBinaryOperator.apply(5, 50);

        assertTrue(expectedMin == actualMin);
    }
}