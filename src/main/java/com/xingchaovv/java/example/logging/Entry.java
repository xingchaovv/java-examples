package com.xingchaovv.java.example.logging;

import com.xingchaovv.java.example.logging.count.CountSheep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Entry {

    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        System.out.println(logger.getName());
        logger.error("some error in Entry");
        logger.warn("has ready?");
        logger.info("ready for Count Sheep");
        CountSheep.run();
        logger.info("finish for Count Sheep");
    }
}
