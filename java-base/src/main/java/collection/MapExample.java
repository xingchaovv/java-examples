package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // Map：无序唯一 Key 键值对
        Map<String, Integer> years = new HashMap<>();
        years.put("七里香", 2001);
        years.put("稻香", 2003);
        // {稻香=2003, 七里香=2001}
        System.out.println(years);
        years.put("七里香", 2002);
        // {稻香=2003, 七里香=2002}
        System.out.println(years);
    }
}
