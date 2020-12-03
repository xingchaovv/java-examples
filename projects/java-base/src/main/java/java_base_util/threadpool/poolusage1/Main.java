package java_base_util.threadpool.poolusage1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4, 8,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<>()
        );
        MatchCounter matchCounter = new MatchCounter();
        for (int i = 0; ++i < 100; ) {
            Future<Integer> future = pool.submit(matchCounter);
        }
        pool.shutdown();

        log.info("getLargestPoolSize: {}", pool.getLargestPoolSize());
    }
}
