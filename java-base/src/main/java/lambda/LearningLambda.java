package lambda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * 学习 Lambda 表达式
 * 学习资料：《Java 编程的逻辑》的《第26章 函数式编程》
 */
public class LearningLambda {

    public static void main(String[] args) {
        File file = new File("./");
        // 接口常被用于传递代码
        // 通过接口传递行为代码，就是要传递一个实现了该接口的实例对象
        // 如下使用匿名内部类
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".md")) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(files));

        // 通过 Lambda 表达式实现
        // (dir, name) 代表方法的参数
        // {} 代表方法的代码
        File[] files2 = file.listFiles((dir, name) -> {
            if (name.endsWith(".md")) {
                return true;
            }
            return false;
        });
        System.out.println(Arrays.toString(files2));

        // 进一步简化
        File[] files3 = file.listFiles((dir, name) -> {
            return name.endsWith(".md");
        });
        System.out.println(Arrays.toString(files3));

        // 进一步简化
        // 当主体代码只有一条语句的时候，只写一个表达式，表达式的值为方法的返回值
        // 结尾不加分页也不加
        File[] files4 = file.listFiles((dir, name) -> name.endsWith(".md"));
        System.out.println(Arrays.toString(files4));

        File[] files5 = file.listFiles((dir, name) -> true);
        System.out.println(Arrays.toString(files5));

        // Lambda 表达式不是匿名内部类，它的类型是函数式接口
    }
}
