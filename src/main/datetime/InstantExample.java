package main.datetime;

import java.time.Duration;
import java.time.Instant;

import static Common.utilities.CommonPredicatesFunctions.printAnythingConsumer;

public class InstantExample {

    public static void main(String[] args) {
        var instant = Instant.now();

        printAnythingConsumer.accept(instant);
        printAnythingConsumer.accept(instant.getEpochSecond());
        printAnythingConsumer.accept(Instant.ofEpochSecond(0));

        var instant2 = Instant.now();

        var duration = Duration.between(instant, instant2);
        printAnythingConsumer.accept(duration.toNanos());
    }
}
