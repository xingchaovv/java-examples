package java_base_util.threadpool.poolusage2;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Main {

    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ExecutorService pool = new ThreadPoolExecutor(4, 4, 60L, TimeUnit.SECONDS, queue);
        for (int taskNum = 0; ++taskNum < 100; ) {
            pool.execute(new ObtainNumber(taskNum));
        }
        pool.shutdown();
    }
}
