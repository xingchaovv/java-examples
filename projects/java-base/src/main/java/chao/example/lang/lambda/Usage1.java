package chao.example.lang.lambda;

public class Usage1 {

    public static void main(String[] args) {
        // 匿名类实现
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("In r1 job.");
            }
        };
        // Lambda 实现
        Runnable r2 = () -> System.out.println("In r2 job.");
        Runnable r3 = () -> {
            System.out.println("In r3 job msg1.");
            System.out.println("In r3 job msg2.");
        };
        r1.run();
        r2.run();
        r3.run();

        callRun(()-> System.out.println("In r4 job."));
    }

    public static void callRun(Runnable runnable) {
        runnable.run();
    }
}
