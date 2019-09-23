package test.methodReference;

import jdk.jfr.Description;
import main.methodReference.FunctionMethodReferenceExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionMethodReferenceExampleTest {

    @Test
    @Description("Ensure the lambda version and  the method reference versions return same thing")
    final void test_FunctionMethodReferenceExample_returnSameResult() {
        final String inputString = "java8 IS Great";

        assertTrue(
                FunctionMethodReferenceExample.toUppercaseLambda.apply(inputString)
                        .equals(FunctionMethodReferenceExample.toUppercaseMethodRefernce.apply(inputString)));
    }
}