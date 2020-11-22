package example.thread.MyInterruptThread;

public class Manage {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepThread = new Thread(new SleepJob());
        sleepThread.start();
        Thread normalThread = new Thread(new NormalJob());
        normalThread.start();

        System.out.println("Main thread sleep 2s.");
        Thread.sleep(2000);

        System.out.println("Interrupt the sleepThread");
        sleepThread.interrupt();
        System.out.println("Interrupt the normalThread");
        normalThread.interrupt();
    }
}
