package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Consumer 接口 Lambda 应用
 */
public class ConsumerUsage {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i ++) {
            list.add("info" + i);
        }

        list.forEach((String s) -> {System.out.println(s);});
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
