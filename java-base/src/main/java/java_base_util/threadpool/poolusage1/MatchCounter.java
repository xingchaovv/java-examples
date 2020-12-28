package java_base_util.threadpool.poolusage1;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

@Slf4j
public class MatchCounter implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {
        String start = LocalDateTime.now().toLocalTime().toString();
        Thread.sleep((long)(Math.random() * 1000));
        String end = LocalDateTime.now().toLocalTime().toString();
        log.info("Thread {} From {} to {}", Thread.currentThread().getName(), start, end);
        return 0;
    }
}
