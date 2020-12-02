package java_base_lang.lambda.predicate;

import java.util.function.Predicate;

/**
 * Predicate 接口 Lambda 应用
 */
public class PredicateUsage {

    public static void main(String[] args) {
        System.out.println(
                validValue("xing", (String s) -> s.startsWith("x"))
        );

        System.out.println(
                validValue("xing", s -> s.startsWith("x"))
        );
    }

    private static <T> boolean validValue(T v, Predicate<T> p) {
        return p.test(v);
    }
}
