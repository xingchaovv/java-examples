package java_base_lang.genericprogram.genericclass.arrayalg;

import java.time.LocalDate;

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
