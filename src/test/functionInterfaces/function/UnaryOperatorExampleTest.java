package test.functionInterfaces.function;

import Common.utilities.CustomUtils;
import main.functionInterfaces.function.UnaryOperatorExample;
import main.models.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnaryOperatorExampleTest {

    @Test
    final void testIncreaseAgeByTen() {
        Person actualPerson = UnaryOperatorExample.increaseAgeByTen.apply(CustomUtils.PERSON_LIST.get(0));
        final int expectedAge = CustomUtils.PERSON_LIST.get(0).getAge() + 10;

        assertTrue(expectedAge == actualPerson.getAge(), "The age was increased by 10");
    }
}