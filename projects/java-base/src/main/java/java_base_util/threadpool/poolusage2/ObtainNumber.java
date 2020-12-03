package java_base_util.threadpool.poolusage2;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@AllArgsConstructor
public class ObtainNumber implements Runnable {

    private Integer taskNum;

    @SneakyThrows
    @Override
    public void run() {
        String start = LocalDateTime.now().toLocalTime().toString();
        log.info("Task {}, Thread {}, Start {}", taskNum, Thread.currentThread().getName(), start);
        Thread.sleep((long)(Math.random() * 1000));
        String end = LocalDateTime.now().toLocalTime().toString();
        log.info("Task {}, Thread {}, End {}", taskNum, Thread.currentThread().getName(), end);
    }
}
