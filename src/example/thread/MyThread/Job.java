package example.thread.MyThread;

public class Job implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: The job run.\n", threadName);
    }
}
