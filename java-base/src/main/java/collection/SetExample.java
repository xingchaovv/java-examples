package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // Set：无序唯一元素集合 Collection
        Set<String> words = new HashSet<>();
        words.add("七里香");
        words.add("稻香");
        // [稻香, 七里香]
        System.out.println(words);
        words.add("七里香");
        // [稻香, 七里香]
        System.out.println(words);
    }
}
