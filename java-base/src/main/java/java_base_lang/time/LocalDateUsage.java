package java_base_lang.time;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class LocalDateUsage {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.printf(
            "%50s %s\n",
            "LocalDate.from(now.toInstant()): ",
            LocalDate.from(Instant.now())
        );
    }
}
