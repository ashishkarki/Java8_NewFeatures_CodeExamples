package main.lambdas;

/**
 * @author Ashish Karki
 */
public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * Before Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("****Running inside Runnable 1 using traditional way****");
            }
        };
        new Thread(runnable).start();

        /**
         * Using Java8 Lambda syntax
         */
        Runnable runnableLambda1 = () -> {
            System.out.println("%%%%Running inside Runnable Lambda 1 using first Lambda way%%%%");
        };
        new Thread(runnableLambda1).start();

        /**
         * Using Java8 Lambda syntax - shortened
         */
        Runnable runnableLambda2 = () -> System.out.println("&&&&Running inside Runnable Lambda 2 using second Lambda way&&&&");
        new Thread(runnableLambda2).start();

        /**
         * Using Java8 Lambda syntax - more shortened
         */
        new Thread(() -> System.out.println("^^^^Running inside Runnable Lambda 3 using third Lambda way")).start();
    }
}
