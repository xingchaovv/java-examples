package java_base_lang.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.util.Date;

public class LocalDatetimeUsage {

    public static void main(String[] args) throws ParseException {
        // 实例化
        System.out.printf("%30s: %s\n", "LocalDateTime.now()", LocalDateTime.now());

        System.out.printf("%30s: %s\n", "fromValues",
                LocalDateTime.of(2021, 1, 2, 3, 4, 5)
        );

        System.out.printf("%30s: %s\n", "fromValues2",
                LocalDateTime.of(2021, Month.FEBRUARY, 2, 3, 4, 5)
        );

        System.out.printf("%30s: %s\n", "parsed",
                LocalDateTime.parse("2021-04-05T06:07:08")
        );

        System.out.printf("ISO_LOCAL_DATE_TIME: %s\n",
                LocalDateTime.now().format(new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE)
                        .appendLiteral(' ')
                        .append(DateTimeFormatter.ISO_LOCAL_TIME)
                        .toFormatter()
                )
        );
    }
}
