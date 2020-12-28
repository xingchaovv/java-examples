package lang_base.trycatch;

public class StackOverflowErrorDemo1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ProcessHandle.current().pid());
        System.out.printf("Free memory: %d MB\n", Runtime.getRuntime().freeMemory() / 1024 / 1024);
        Thread.sleep(1000 * 5);
        go();
    }

    private static void go() {
        go();
    }
}
