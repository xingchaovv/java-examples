package lambda;

/**
 * Lambda 方式操作 Runnable
 */
public class RunnableByLambdaExample {

    public static void main(String[] args) {
        // 通过匿名类构建 Runnable 实例
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("In r1 job.");
            }
        };
        r1.run();

        // Lambda 实现
        Runnable r2 = () -> {
            System.out.println("In r2 job msg1.");
            System.out.println("In r2 job msg2.");
        };
        r2.run();

        Runnable r3 = () -> System.out.println("In r3 job.");
        r3.run();

        Runnable r4 = () -> System.out.println();
        r4.run();

        Runnable r5 = System.out::println;
        r5.run();
    }
}
