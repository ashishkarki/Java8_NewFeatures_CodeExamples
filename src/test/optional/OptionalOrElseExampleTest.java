package test.optional;

import Common.utilities.CustomUtils;
import main.optional.OptionalOrElseExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionalOrElseExampleTest {

    @Test
    final void testDemoOrElseNotNull_returns_correct_string() {
        assertEquals(
                CustomUtils.ONE_PERSON.getName(),
                OptionalOrElseExample.demoOrElse(CustomUtils.personOptionalNotNull));
    }

    @Test
    final void testDemoOrElseNull_returns_orElse_string() {
        assertEquals(
                CustomUtils.someString,
                OptionalOrElseExample.demoOrElse(CustomUtils.personOptionalNull));
    }

    @Test
    final void testDemoOrElseGetNotNull_returns_correct_string() {
        assertEquals(
                CustomUtils.ONE_PERSON.getName(),
                OptionalOrElseExample.demoOrElseGet(CustomUtils.personOptionalNotNull));
    }

    @Test
    final void testDemoOrElseGetNull_returns_orElse_string() {
        assertEquals(
                CustomUtils.someString,
                OptionalOrElseExample.demoOrElseGet(CustomUtils.personOptionalNull));
    }

    @Test
    final void testDemoOrElseThrowNotNull_returns_correct_string() {
        assertEquals(
                CustomUtils.ONE_PERSON.getName(),
                OptionalOrElseExample.demoOrElseThrow(CustomUtils.personOptionalNotNull));
    }

    @Test
    final void testDemoOrElseThrowNull_returns_orElse_string() {
        assertThrows(RuntimeException.class, () -> {
            OptionalOrElseExample.demoOrElseThrow(CustomUtils.personOptionalNull);
        });
    }

}