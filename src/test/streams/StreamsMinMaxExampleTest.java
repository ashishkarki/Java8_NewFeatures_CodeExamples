package test.streams;

import Common.utilities.CustomUtils;
import main.streams.StreamsMinMaxExample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StreamsMinMaxExampleTest {

    @Test
    final void testFindMaxValue_worksFor_emptyList() {
        final var emptyList = new ArrayList<Integer>();
        Optional<Integer> maxValue = StreamsMinMaxExample.findMaxValue(emptyList);

        assertTrue(maxValue.isPresent() == false);
    }

    @Test
    final void testFindMaxValue_worksFor_ascendingList() {
        final var emptyList = CustomUtils.INTEGERS_LIST;
        Optional<Integer> maxValue = StreamsMinMaxExample.findMaxValue(emptyList);

        assertTrue(maxValue.isPresent() == true);
        assertTrue(maxValue.get() == 5);
    }

    @Test
    final void testFindMaxValue_worksFor_descendingList() {
        final var emptyList = Arrays.asList(5, 4, 3, 2, 1);
        Optional<Integer> maxValue = StreamsMinMaxExample.findMaxValue(emptyList);

        assertTrue(maxValue.isPresent() == true);
        assertTrue(maxValue.get() == 5);
    }

    @Test
    final void testFindMaxValue_worksFor_randomList() {
        final var emptyList = Arrays.asList(-5, 4, 13, 0, 1);
        Optional<Integer> maxValue = StreamsMinMaxExample.findMaxValue(emptyList);

        assertTrue(maxValue.isPresent() == true);
        assertTrue(maxValue.get() == 13);
    }

    @Test
    final void testFindMinValue_worksFor_emptyList() {
        final var emptyList = new ArrayList<Integer>();
        Optional<Integer> minValue = StreamsMinMaxExample.findMinValue(emptyList);

        assertTrue(minValue.isPresent() == false);
    }

    @Test
    final void testFindMinValue_worksFor_ascendingList() {
        final var emptyList = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> minValue = StreamsMinMaxExample.findMinValue(emptyList);

        assertTrue(minValue.isPresent() == true);
        assertTrue(minValue.get() == 1);
    }

    @Test
    final void testFindMinValue_worksFor_descendingList() {
        final var emptyList = Arrays.asList(5, 4, 3, 2, 1);
        Optional<Integer> minValue = StreamsMinMaxExample.findMinValue(emptyList);

        assertTrue(minValue.isPresent() == true);
        assertTrue(minValue.get() == 1);
    }

    @Test
    final void testFindMinValue_worksFor_randomList() {
        final var emptyList = Arrays.asList(-5, 4, 13, 0, 1);
        Optional<Integer> minValue = StreamsMinMaxExample.findMinValue(emptyList);

        assertTrue(minValue.isPresent() == true);
        assertTrue(minValue.get() == -5);
    }
}