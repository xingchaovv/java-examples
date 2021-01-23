package java_base_lang.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class ZonedDatetimeAndDate {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now: " + now);

        ZonedDateTime japanNow = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("japanNow: " + japanNow);

        ZonedDateTime dt1 = ZonedDateTime.of(2021, 1, 2, 8, 10, 0, 0, ZoneId.systemDefault());
        System.out.println("dt1: " + dt1);

        Date d2 = new Calendar.Builder().setDate(2021, Calendar.FEBRUARY, 5).setTimeOfDay(10, 15, 0).build().getTime();
        ZonedDateTime dt2 = d2.toInstant().atZone(ZoneId.systemDefault());
        System.out.println("dt2: " + dt2);

        ZonedDateTime dt3 = dt2.plusDays(2);
        System.out.println("dt2: " + dt2);
        System.out.println("dt3: " + dt3);

        Date d4 = Date.from(dt2.toInstant());
        System.out.println("d4 from d2: " + d4);

        ZonedDateTime dt5 = ZonedDateTime.parse("2021-03-01T12:01:02+08:00");
        System.out.println("dt5: " + dt5 + ", " + Date.from(dt5.toInstant()));
    }
}
