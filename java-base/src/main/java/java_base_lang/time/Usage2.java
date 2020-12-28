package java_base_lang.time;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Usage2 {

    public static void main(String[] args) {


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate birthday = LocalDate.parse("12092017", fmt1);
        System.out.printf("birthday: %s\n", birthday);
        System.out.printf("day of week: %s\n", birthday.getDayOfWeek());

        Period toToday = Period.between(birthday, LocalDate.now());
        System.out.printf("days: %s\n", toToday.getDays());
        System.out.printf("months: %s\n", toToday.getMonths());
        System.out.printf("years: %s\n", toToday.getYears());

        long sumDays = birthday.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.printf("sumDays: %s\n", sumDays);
    }
}
