package java_base_lang.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Usage1 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 12, 31);
        Period oneMonth = Period.ofMonths(1);
        LocalDate date2 = date1.plus(oneMonth);
        LocalDate date3 = date1.minus(oneMonth);
        System.out.printf("date1: %s\n", date1);
        System.out.printf("date2: %s\n", date2);
        System.out.printf("date3: %s\n", date3);

        System.out.println(LocalDate.parse("2020-11-01"));
    }
}
