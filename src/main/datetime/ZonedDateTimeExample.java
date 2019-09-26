package main.datetime;

import java.time.*;

import static Common.utilities.CommonPredicatesFunctions.printAnythingConsumer;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        var zonedDateTime = ZonedDateTime.now();

        printAnythingConsumer.accept(zonedDateTime);
        printAnythingConsumer.accept(zonedDateTime.getOffset());
        printAnythingConsumer.accept(zonedDateTime.getZone());
        printAnythingConsumer.accept(ZoneId.getAvailableZoneIds());

        System.out.println("Now to print Zoned per the ZoneId");
        var zonedDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
        printAnythingConsumer.accept(zonedDT);

        // another way to do the zoneDT
        var zoneDTWithClock = ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
        printAnythingConsumer.accept(zoneDTWithClock);

        // now using localdatetime
        var localDateTime1 = LocalDateTime.now(ZoneId.of("America/Chicago"));
        printAnythingConsumer.accept(localDateTime1);

        var localDateTime2 = LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
        printAnythingConsumer.accept(localDateTime2);

        // NOW WE LOOK AT HOW TO CONVERT BETWEEN LOCALDATETIME AND ZONEDDATETIME
        var localDateTime3 = LocalDateTime.now();
        printAnythingConsumer.accept("localDatetime3:" + localDateTime3);

        var zonedDateTime3 = localDateTime3.atZone(ZoneId.of("America/Chicago"));
        printAnythingConsumer.accept("zonedDateTime3:" + zonedDateTime3);

        var zonedDateTime4 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        printAnythingConsumer.accept("zonedDateTime4:" + zonedDateTime4);

        // now to show the difference between ZONEDDATETIME and OFFSETDATETIME
        OffsetDateTime offsetDateTime1 = localDateTime3.atOffset(ZoneOffset.ofHours(-6));
        printAnythingConsumer.accept("offsetDateTime1:" + offsetDateTime1);
    }
}
