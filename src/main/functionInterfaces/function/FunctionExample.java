package main.functionInterfaces.function;

import java.util.function.Function;

public class FunctionExample {
    final static Function<String, String> uppercaseFunction = (str) -> str.toUpperCase();
    final static Function<String, String> lowercaseAndConcatFunction = (str) -> str.toLowerCase().concat(" and concatenating something");

    public static String convertToUppercase(String inputStr) {
        return uppercaseFunction.apply(inputStr);
    }

    public static String convertToLowerCaseAndConcat(String inputStr) {
        // andThen function executes the Functions in sequence starting with its Function and then its parameter
        return uppercaseFunction.andThen(lowercaseAndConcatFunction).apply(inputStr);
    }

    public static String convertBackToUppercase(String inputStr) {
        // andThen function executes the Functions starting with its parameter and then its caller
        return uppercaseFunction.compose(lowercaseAndConcatFunction).apply(inputStr);
    }
}
