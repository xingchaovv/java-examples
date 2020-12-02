package java_base_lang.thread.MyCreateThread;

public class Job implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: The job run.\n", threadName);
        sayHello();
        System.out.printf("%s: The job end.\n", threadName);
    }

    private synchronized void sayHello() {
        System.out.println(Thread.currentThread().getName() + ": Hello.");
    }
}
