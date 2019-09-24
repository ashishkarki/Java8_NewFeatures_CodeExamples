package test.streams;

import Common.utilities.CustomUtils;
import main.streams.StreamsFlatMapExample;
import org.junit.jupiter.api.Test;

import static Common.utilities.CustomUtils.PERSON_DISTINCT_SORTED_ACTIVITIES_LIST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamsFlatMapExampleTest {

    @Test
    final void testGetAllDistinctSortedActivities() {
        final var actualActivitiesList = StreamsFlatMapExample.getAllDistinctSortedActivities(CustomUtils.PERSON_LIST);
        final var expectedActivitiesList = PERSON_DISTINCT_SORTED_ACTIVITIES_LIST;

        assertEquals(expectedActivitiesList, actualActivitiesList);
    }

    @Test
    final void testtGetCountOfDistinctActivities() {
        final var actualActivitiesCount = StreamsFlatMapExample.getCountOfDistinctActivities(CustomUtils.PERSON_LIST);

        assertTrue(actualActivitiesCount == 3);
    }
}