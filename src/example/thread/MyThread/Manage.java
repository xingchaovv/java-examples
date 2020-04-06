package example.thread.MyThread;

public class Manage {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Job());
        Thread t2 = new Thread(new Job());
        Thread t3 = new Thread(new Job());
        t1.start();
        t2.start();
        t3.start();
    }
}
