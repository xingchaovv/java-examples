package com.xingchaovv.java.example.thread.MyInterruptThread;

public class SleepJob implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.printf("The job run in %s.\n", thread.getName());

        while (true) {
            System.out.printf("The job process some tomato in %s.\n", thread.getName());

            try {
                System.out.printf("The job process start sleep in %s.\n", thread.getName());
                Thread.sleep(10000);
                System.out.printf("The job process end sleep in %s.\n", thread.getName());
            } catch (InterruptedException e) {
                System.out.printf("Catches InterruptedException %s in %s.\n", e.toString(), thread.getName());
                break; // 结束处理任务
            }

            // 检查中断请求
            if (Thread.currentThread().isInterrupted()) {
                // 收到中断请求
                System.out.printf("Get isInterrupted in %s.\n", thread.getName());
                break; // 结束处理任务
            }
        }
    }
}
