package jvm.memory;

/**
 * @example 通过创建大量线程模拟内存不足，报错OutOfMemoryError
 */
public class OutOfMemoryErrorByThreads {

    public void launchThreads() {
        while (true) {
            Thread thread = new Thread(() -> { while (true) {} });
            thread.start();
        }
    }

    /**
     * 小心：运行本程序，会引起系统无响应。
     * 配置 VM Options: -Xss2M
     */
    public static void main(String[] args) {
        OutOfMemoryErrorByThreads flow = new OutOfMemoryErrorByThreads();
        flow.launchThreads();
// 输出
// [28.165s][warning][os,thread] Failed to start thread - pthread_create failed (EAGAIN) for attributes: stacksize: 2048k, guardsize: 4k, detached.
// [42.596s][warning][os,thread] Failed to start thread - pthread_create failed (EAGAIN) for attributes: stacksize: 2048k, guardsize: 4k, detached.
// Error occurred during initialization of VM
// java.lang.OutOfMemoryError: unable to create native thread: possibly out of memory or process/resource limits reached
    }
}
