package test.numericStreams;

import Common.utilities.CustomUtils;
import main.numericStreams.NumericStreamsExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericStreamsExampleTest {

    @Test
    final void test_that_both_ways_return_same_result() {
        final var sumUsingUnboxingWay = NumericStreamsExample.getSumOfIntegers(CustomUtils.INTEGERS_LIST);
        final var sumUsingIntStreamWay = NumericStreamsExample.getSumOfIntegersBetterWay(1, 5);

        assertTrue(sumUsingIntStreamWay == sumUsingUnboxingWay);
    }

}