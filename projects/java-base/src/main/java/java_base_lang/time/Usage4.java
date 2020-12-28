package java_base_lang.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Usage4 {

    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
        LocalDate d2 = d.plusDays(1);
        System.out.print(f1.format(d) + " ");
        System.out.println(d2.format(f1));
    }
}
