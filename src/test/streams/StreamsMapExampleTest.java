package test.streams;

import Common.utilities.CustomUtils;
import main.models.Person;
import main.streams.StreamsMapExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamsMapExampleTest {

    List<Person> testPersonList;

    @BeforeEach
    final void setup() {
        testPersonList = CustomUtils.PERSON_LIST;
    }

    @Test
    final void testGetNameListFromMap() {
        final var expectedList = Arrays.asList("John", "Jenny", "Davidson", "Lauren", "OmkarNath", "JayaKumari");

        final var actualList = StreamsMapExample.getNameListFromMap(testPersonList);

        assertEquals(expectedList, actualList);
    }
}