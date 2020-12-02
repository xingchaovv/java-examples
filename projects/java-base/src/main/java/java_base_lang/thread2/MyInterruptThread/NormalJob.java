package java_base_lang.thread2.MyInterruptThread;

public class NormalJob implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.printf("The job run in %s.\n", thread.getName());

        while (true) {
            System.out.printf("The job process some tomato in %s.\n", thread.getName());
            // 检查中断请求
            if (Thread.currentThread().isInterrupted()) {
                // 收到中断请求
                System.out.printf("Get isInterrupted in %s.\n", thread.getName());
                break; // 结束处理任务
            }
        }
    }
}
