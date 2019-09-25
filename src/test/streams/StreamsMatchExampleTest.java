package test.streams;

import Common.utilities.CustomUtils;
import main.streams.StreamsMatchExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamsMatchExampleTest {

    @Test
    final void testCheckForAllMatch() {
        final var actualResult = StreamsMatchExample.checkForAllMatch(CustomUtils.PERSON_LIST);
        final var expectedResult = false;

        assertTrue(expectedResult == actualResult);
    }

    @Test
    final void testCheckForAnyMatch() {
        final var actualResult = StreamsMatchExample.checkForAnyMatch(CustomUtils.PERSON_LIST);
        final var expectedResult = true;

        assertTrue(expectedResult == actualResult);
    }

    @Test
    final void testCheckForNoneMatch() {
        final var actualResult = StreamsMatchExample.checkForNoneMatch(CustomUtils.PERSON_LIST);
        final var expectedResult = false;

        assertTrue(expectedResult == actualResult);
    }
}