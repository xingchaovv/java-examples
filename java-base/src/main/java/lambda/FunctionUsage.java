package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Function 接口 Lambda 应用
 */
public class FunctionUsage {

    public static void main(String[] args) {
        List<Integer> lengths = lengths(Arrays.asList("xing", "chao", "zhang"), String::length);
        lengths.forEach(System.out::println);
    }

    public static <T, R> List<R> lengths(List<T> original, Function<T, R> func) {
        List<R> lengths = new ArrayList<>();
        original.forEach((T t) -> {
            lengths.add(func.apply(t));
        });
        return lengths;
    }
}
