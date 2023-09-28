package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // List：有序不唯一元素集合 Collection
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("七里香", "稻香", "园游会"));
        words.add("稻香");
        // [七里香, 稻香, 园游会, 稻香]
        System.out.println(words);
    }
}
