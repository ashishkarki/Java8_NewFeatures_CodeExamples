package test.terminalOperations;

import Common.utilities.CustomUtils;
import main.terminalOperations.JoiningCollectorExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoiningCollectorExampleTest {

    @Test
    final void testPerformJoiningCollectionWithDelimiter() {
        final var actualJoinedStr = JoiningCollectorExample.performJoiningCollectionWithDelimiter(
                CustomUtils.PERSON_LIST
        );

        final var expectedJoinedStr = "John_Jenny";

        assertEquals(expectedJoinedStr, actualJoinedStr);
    }

    @Test
    final void testPerformJoiningCollectionWithDelimiterPrefixSuffix() {
        final var actualJoinedStr = JoiningCollectorExample.performJoiningCollectionWithDelimiterPrefixSuffix(
                CustomUtils.PERSON_LIST
        );

        final var expectedJoinedStr = "(John_Jenny)";

        assertEquals(expectedJoinedStr, actualJoinedStr);
    }
}