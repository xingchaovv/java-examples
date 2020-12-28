package java_base_lang.lambda.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Usage2 {

    private static List<Integer> nums;
    static {
        nums = Arrays.asList(101, 102, 103, 201, 202, 203);
    }

    public static void main(String[] args) {
        Usage2 usage2 = new Usage2();
        List<Integer> res1 = usage2.queryItems(e -> e > 200);
        System.out.println(res1);
    }

    private List<Integer> queryItems(Predicate<Integer> checkIsTrue) {
        List<Integer> res = new ArrayList<>();
        nums.forEach(e -> {
            if (checkIsTrue.test(e)) {
                res.add(e);
            }
        });
        return res;
    }
}
