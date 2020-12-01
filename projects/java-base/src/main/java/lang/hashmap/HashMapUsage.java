package lang.hashmap;

import java.util.HashMap;

public class HashMapUsage {

    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Aa", 101);
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
        System.out.println(items.containsKey(new String("Aa")));
        System.out.println(items.containsKey("Aa"));
        System.out.println(items.containsKey("BB"));
    }
}
