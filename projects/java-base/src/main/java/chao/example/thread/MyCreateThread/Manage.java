package chao.example.thread.MyCreateThread;

public class Manage {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Job());
        Thread t2 = new Thread(new Job());
        Thread t3 = new Thread(new Job());
        t1.start();
        t2.start();
        t3.start();

        // Lambda 写法
        Thread t4 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: The anonymous job run.\n", threadName);
        });
        t4.start();

        System.out.println("This is main thread.");
    }
}
