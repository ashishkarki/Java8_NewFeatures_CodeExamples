package main.datetime;

import Common.utilities.CommonPredicatesFunctions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewDateTimeExample {

    public static void compareLocalDatesDemo() {
        var localDate1 = LocalDate.of(2019, 1, 1);
        var localDate2 = LocalDate.of(2019, 12, 31);

        // Many ways to find the duration between these two dates
        // 1. using localdate.until
        var period = localDate1.until(localDate2);
        CommonPredicatesFunctions.printAnythingConsumer.accept(period.getDays()); // simply does 31 - 1 for days
        CommonPredicatesFunctions.printAnythingConsumer.accept(period.getMonths()); // simply does 12 - 1 for months

        var tenYearsPeriod = Period.ofYears(10);
        CommonPredicatesFunctions.printAnythingConsumer.accept(tenYearsPeriod.getYears());
        CommonPredicatesFunctions.printAnythingConsumer.accept((tenYearsPeriod.toTotalMonths())); // this is the only factory method

        // 2. second method to get duration using period.between
        var period2 = Period.between(localDate1, localDate2);
        CommonPredicatesFunctions.printAnythingConsumer.accept(period2.getYears() + " years| " + period2.getMonths() + " months| "
                + period2.getDays() + " days");
    }

    public static void main(String[] args) {
        final var localTime = LocalTime.now();
        CommonPredicatesFunctions.printAnythingConsumer.accept(localTime.toString());

        CommonPredicatesFunctions.printAnythingConsumer.accept(localTime.getHour());
        CommonPredicatesFunctions.printAnythingConsumer.accept(localTime.minus(2, ChronoUnit.HOURS));
        CommonPredicatesFunctions.printAnythingConsumer.accept(localTime.with(LocalTime.NOON));

        compareLocalDatesDemo();
    }

}