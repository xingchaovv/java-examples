package jvm.garbage.collection.test1;

import lombok.extern.slf4j.Slf4j;
import java.util.Date;

@Slf4j
public class FuncGc {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        log.info("Total memory: {} MB", rt.totalMemory() / 1024 / 1024);
        log.info("Free memory before generating objects: {} MB", rt.freeMemory() / 1024 / 1024);
        for (int i = 0; i++ < 1000000000;) {
            Date myDate = new Date();
            myDate = null;
        }
        log.info("Free memory After generating objects: {} MB", rt.freeMemory() / 1024 / 1024);
        rt.gc();
        log.info("Free memory After gc: {} MB", rt.freeMemory() / 1024 / 1024);
    }
}
