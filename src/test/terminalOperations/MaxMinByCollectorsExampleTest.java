package test.terminalOperations;

import Common.utilities.CustomUtils;
import main.terminalOperations.MaxMinByCollectorsExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinByCollectorsExampleTest {

    @Test
    final void testGetMaxByAgePerson() {
        final var actualMaxByOptional = MaxMinByCollectorsExample.getMaxByAgePerson(CustomUtils.PERSON_LIST);

        assertTrue(actualMaxByOptional.isPresent());
        assertEquals(CustomUtils.PERSON_LIST.get(4).getName(), actualMaxByOptional.get().getName());
    }

    @Test
    final void testGetMinByAgePerson() {
        final var actualMaxByOptional = MaxMinByCollectorsExample.getMaxByAgePerson(CustomUtils.PERSON_LIST);

        assertTrue(actualMaxByOptional.isPresent());
        assertEquals(CustomUtils.PERSON_LIST.get(1).getName(), actualMaxByOptional.get().getName());
    }

}