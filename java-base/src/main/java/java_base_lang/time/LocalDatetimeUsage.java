package java_base_lang.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
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

        // 操作时间
        System.out.printf("%30s: %s\n", "Two days later",
                LocalDateTime.now().plusDays(2)
        );
    }
}
