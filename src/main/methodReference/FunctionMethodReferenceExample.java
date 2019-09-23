package main.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static final Function<String, String> toUppercaseLambda = (str) -> str.toUpperCase();

    public static final Function<String, String> toUppercaseMethodRefernce = String::toUpperCase;
}
