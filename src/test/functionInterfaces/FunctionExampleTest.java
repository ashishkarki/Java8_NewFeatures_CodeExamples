package test.functionInterfaces;

import jdk.jfr.Description;
import main.functionInterfaces.FunctionExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionExampleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @Description("Confirm that convertToUppercase() is making everything uppercase")
    final void testConvertToUppercase() {
        final String testStr = "java8 is Great";
        final String expected = "JAVA8 IS GREAT";
        final String actual = FunctionExample.convertToUppercase(testStr);

        assertEquals(expected, actual);
    }

    @Test
    @Description("Confirm that convertToLowerCaseAndConcat() makes everything lowercase and appends 'and concatenating something")
    final void testConvertToLowerCaseAndConcat() {
        final String testStr = "java8 is Great";
        final String expected = "java8 is great and concatenating something";
        final String actual = FunctionExample.convertToLowerCaseAndConcat(testStr);

        assertEquals(expected, actual);
    }

    @Test
    @Description("Confirm that convertBackToUppercase() converts everything back to uppercase")
    final void testconvertBackToUppercase() {
        final String testStr = "java8 is Great";
        final String expected = "JAVA8 IS GREAT AND CONCATENATING SOMETHING";
        final String actual = FunctionExample.convertBackToUppercase(testStr);

        assertEquals(expected, actual);
    }
}
