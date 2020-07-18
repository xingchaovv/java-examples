package com.xingchaovv.java.example.logging.count;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CountSheep {

    public static final Logger logger = LogManager.getLogger();

    public static void run() {
        System.out.println(logger.getName());
        logger.error("error sheep?");
        logger.warn("has sheep?");
        logger.info("one sheep.");
        logger.info("two sheep.");
        logger.info("three sheep.");
        logger.info("four sheep.");
        logger.info("five sheep.");
        for (int i = 0; i < 100000; i++) {
            logger.info("count sheep one more.");
        }
    }
}
