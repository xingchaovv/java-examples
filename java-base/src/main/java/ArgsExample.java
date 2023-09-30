import java.util.Arrays;

/**
 * main 方法参数 args 的用法
 */
public class ArgsExample {

    public static void main(String[] args) {
        // ArgsExample 为 main 方法，red blue 为追加的参数
        // main 方法执行命令
        // % java ArgsExample red blue
        // 输出
        // [red, blue]
        System.out.println(Arrays.toString(args));
    }
}
