package example.lamba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            list.add("info" + i);
        }
        list.forEach(System.out::println);
    }
}
