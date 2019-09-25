package test.terminalOperations;

import Common.utilities.CustomUtils;
import main.terminalOperations.CountingCollectorExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingCollectorExampleTest {

    @Test
    final void testPerformJoiningCollectionWithDelimiter() {
        assertTrue(
                CountingCollectorExample.performJoiningCollectionWithDelimiter(CustomUtils.PERSON_LIST) ==
                        4
        );
    }

}