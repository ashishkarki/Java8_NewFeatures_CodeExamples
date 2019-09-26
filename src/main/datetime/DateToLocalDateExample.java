package main.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

import static Common.utilities.CommonPredicatesFunctions.printAnythingConsumer;

public class DateToLocalDateExample {
    // convert java.util.Date/sql.Date to the new LocalDateTime

    public static void main(String[] args) {
        // first util.date to localdatetime and vice-versa
        var utilDate = new Date();
        printAnythingConsumer.accept("utilDate: " + utilDate);

        var localDateTime = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        printAnythingConsumer.accept("localDateTime: " + localDateTime);

        // back to Date
        var reversedUtilDate = new Date().from(localDateTime.toInstant(ZoneOffset.ofHours(0)));
        printAnythingConsumer.accept("reversedUtilDate: " + reversedUtilDate);

        // second sql.date to localdate and vice-versa
        var sqlDate = java.sql.Date.valueOf(localDateTime.toLocalDate());
        printAnythingConsumer.accept("sqlDate:" + sqlDate);

        // back to localdate
        var reversedLocalDate = sqlDate.toLocalDate();
        printAnythingConsumer.accept("reversedLocalDate: " + reversedLocalDate);

    }
}
