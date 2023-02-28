package day3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class PredefinedClass {

    public static void main(String[] args) {

        long rounded = Math.round(2.50);

        System.out.println(rounded);

        double floored = Math.floor(2.999999);

        System.out.println(floored);

        double ceiled = Math.ceil(2.00001);

        System.out.println(ceiled);

        double random = Math.random() * 10;

        System.out.println(random);


        Date curretDate = new Date();

        System.out.println(curretDate);

        Date oldDate = new Date(1677113632471L);

        System.out.println(oldDate);

        boolean test1 = curretDate.before(oldDate);

        System.out.println(test1);

        boolean isEqual = curretDate.equals(curretDate);

        System.out.println(isEqual);

        Date birthDate = new Date(1993-1900, 11, 7);

        System.out.println(birthDate);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.minus(1, ChronoUnit.DAYS));


//        LocalDate specificDate = LocalDate.of(2023, 2, 7);
//
//        System.out.println(specificDate.lengthOfMonth());
//
//        LocalDateTime specificDateAndTime = LocalDateTime.of(1993, 12, 7, 1, 30, 0);
//
//        System.out.println(specificDateAndTime);

        LocalDateTime date2 = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("EST")));

        System.out.println(date2.format(DateTimeFormatter.ofPattern("EEE dd MMM yyyy")));

        LocalDate stringParsedDate = LocalDate.parse("Thu 23 Feb 2023", DateTimeFormatter.ofPattern("EEE dd MMM yyyy"));

        System.out.println(stringParsedDate);

        Calendar now = Calendar.getInstance();
        now.set(1993, 12, 7);

        System.out.println(now);
    }
}
