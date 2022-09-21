package logging_util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java Logging 官方文档
 * https://docs.oracle.com/en/java/javase/11/core/java-logging-overview.html#GUID-B83B652C-17EA-48D9-93D2-563AE1FF8EDA
 */
public class Application {

    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();

        logger.setLevel(Level.WARNING);

        logger.info("测试 INFO 文本");
        logger.warning("测试 WARNING 文本");
        logger.severe("测试 SEVERE 文本");
    }
}
