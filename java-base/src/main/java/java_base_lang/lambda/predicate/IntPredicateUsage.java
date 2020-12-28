package java_base_lang.lambda.predicate;

import java.util.function.IntPredicate;

/**
 * IntPredicate 接口 Lambda 应用
 */
public class IntPredicateUsage {

    public static void main(String[] args) {
        System.out.println(
                validInt(6, (int v) -> v > 10)
        );
        System.out.println(
                validInt(12, (int v) -> v > 10)
        );
    }

    private static boolean validInt(int v, IntPredicate p) {
        return p.test(v);
    }
}
