package main.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static Common.utilities.CommonPredicatesFunctions.printAnythingConsumer;

public class DurationExample {

    public static void durationDemo() {
        var localTime1 = LocalTime.of(10, 15);
        var localTime2 = LocalTime.of(12, 15);

        long minutes = localTime1.until(localTime2, ChronoUnit.MINUTES);
        printAnythingConsumer.accept(minutes);

        // ANOTHER WAY TO FIND DURATION
        var duration = Duration.between(localTime1, localTime2);
        printAnythingConsumer.accept(duration.toMinutes());
    }

    public static void main(String[] args) {
        durationDemo();
    }
}
