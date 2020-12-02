package lang.genericprogram.genericclass.arrayalg;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(2002, 11, 1),
                LocalDate.of(2010, 1, 1),
                LocalDate.of(2002, 10, 20),
                LocalDate.of(2020, 11, 11),
        };
        Pair<LocalDate> minAndMax = ArrayAlg.findMinAndMax(birthdays);
        System.out.println(minAndMax);
    }
}
