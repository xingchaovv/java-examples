package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello world.");
        logger.error("Hello world.");

        Logger myLogger = LoggerFactory.getLogger("myLogger");
        myLogger.info("Hello world.");
    }
}
