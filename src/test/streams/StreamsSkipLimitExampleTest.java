package test.streams;

import Common.utilities.CustomUtils;
import main.streams.StreamsSkipLimitExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamsSkipLimitExampleTest {

    @Test
    final void testLimitStreamToN() {
        final var actualSumOptional = StreamsSkipLimitExample.limitStreamToN(CustomUtils.INTEGERS_LIST, 2);
        final var expectedSum = 3;

        assertTrue(actualSumOptional.isPresent());
        assertTrue(expectedSum == actualSumOptional.get());
    }

    @Test
    final void testSkipNElementsFromStream() {
        final var actualSumOptional = StreamsSkipLimitExample.skipNElementsFromStream(CustomUtils.INTEGERS_LIST, 2);
        final var expectedSum = 12;

        assertTrue(actualSumOptional.isPresent());
        assertTrue(expectedSum == actualSumOptional.get());
    }

}