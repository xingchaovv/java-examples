package lambda;

/**
 * Runnable 的 Lambda 表达式
 */
public class RunnableExample {

    public static void main(String[] args) {
        // 通过匿名类实现 Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("In r1 job.");
            }
        };
        r1.run();

        // 通过 Lambda 实现
        Runnable r2 = () -> {
            System.out.println("In r2 job msg1.");
            System.out.println("In r2 job msg2.");
        };
        r2.run();

        // 通过 Lambda 实现
        Runnable r3 = () -> System.out.println("In r3 job.");
        r3.run();

        // 通过 Lambda 实现
        Runnable r4 = () -> System.out.println();
        r4.run();

        // 通过 Lambda 实现
        Runnable r5 = System.out::println;
        r5.run();
    }
}
