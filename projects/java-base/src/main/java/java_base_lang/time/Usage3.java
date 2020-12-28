package java_base_lang.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Usage3 {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("E MMM dd, yyyy G")));
    }
}
