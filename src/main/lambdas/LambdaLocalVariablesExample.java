package main.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaLocalVariablesExample {
    // declare a static variable
    static int countStaticVar = 0;

    public static void main(String[] args) {
        // declare a local variable (one inside a method's scope)
        int countLocalVar = 0;

       // declare a consumer lambda and try to consume these variables
        // Error: countLocalVar is local variable and cannot be used within lambda body
        // Okay: countStaticVar is static (same for instance) and can be used within lambda body
        Consumer<Integer> someConsumer = (/*countLocalVar*/ countStaticVar) -> {
            // However, it is okay to use local variable  inside lambda body.
            // such local variables that are used/capturized by a lambda cannot be modified anywhere else.
            // and that is why we say local variables captured in lambda must be final or effectively final.
            System.out.println("Printing whatever I got : " + countLocalVar);
        };

        // this is Not Allowed, since 'countLocalVar' is being captured by someConsumer lambda above
        // if we uncomment this line the sysout statement within someConsumer will show error.
        // countLocalVar += 1;

        // Now declare a supplier lambda and try to use one or more of these variables
        Supplier<Integer> someSupplier = () -> {
            //this is error since 'count' is local variable being modified within capturing lambda
            //return count++;

            // this line is okay, since there is no modification of local variable 'count'
            //return countLocalVar;

            // this line is okay, static variables are allowed to be modified. And so far instance variables.
            return countStaticVar++;
        };
    }
}
