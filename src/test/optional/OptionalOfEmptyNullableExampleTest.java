package test.optional;

import Common.utilities.CustomUtils;
import main.optional.OptionalOfEmptyNullableExample;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalOfEmptyNullableExampleTest {

    @Test
    final void testDemoOfNullableNotEmpty() {
        final var expectedOptional = OptionalOfEmptyNullableExample.demoOfNullableNotEmpty();

        assertTrue(expectedOptional.isPresent());
        assertTrue(expectedOptional.get() == CustomUtils.someString);
    }

    @Test
    final void testDemoOfNullableEmpty() {
        final var expectedOptional = OptionalOfEmptyNullableExample.demoOfNullableEmpty();

        assertFalse(expectedOptional.isPresent());
        assertTrue(expectedOptional.isEmpty());
    }

    @Test
    final void testDemoOfNotEmpty() {
        final var expectedOptional = OptionalOfEmptyNullableExample.demoOfNotEmpty();

        assertTrue(expectedOptional.isPresent());
        assertTrue(expectedOptional.get() == CustomUtils.someString);
    }

    @Test
    final void testDemoEmpty() {
        assertEquals(OptionalOfEmptyNullableExample.demoEmpty(), Optional.empty());
    }
}