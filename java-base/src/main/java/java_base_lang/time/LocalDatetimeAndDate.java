package java_base_lang.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class LocalDatetimeAndDate {

    public static void main(String[] args) throws ParseException {
        LocalDateTime ldt1 = LocalDateTime.parse("2021-04-05T06:07:08");
        Date date1 = Date.from(ldt1.atZone(ZoneId.systemDefault()).toInstant());
        System.out.printf("%30s: %s\n", "ldt1", ldt1);
        System.out.printf("%30s: %s\n", "date1 from ltd1", date1);

        Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-02-05 10:15:01");
        LocalDateTime ldt2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());
        System.out.printf("%30s: %s\n", "date2", date2);
        System.out.printf("%30s: %s\n", "ldt2 from date2", ldt2);
    }
}
