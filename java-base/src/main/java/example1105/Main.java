package example1105;

/**
 * shutdownHook 用法
 */
public class Main {

    public static void main(String[] args) {
        Runnable shutdownProcess = () -> System.out.println("ShutdownProcess run.");
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownProcess));

        Runnable task1 = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Run task1.");
            } catch (InterruptedException e) {
            }
        };
        Runnable task2 = () -> {
            try {
                Thread.sleep(3000);
                System.out.println("Run task2.");
            } catch (InterruptedException e) {
            }
        };
        task1.run();
        task2.run();
    }
}
